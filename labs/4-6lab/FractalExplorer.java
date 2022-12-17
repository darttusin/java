import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.geom.Rectangle2D;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import javax.swing.*;

public class FractalExplorer {

    private int displaySize;

    private JImageDisplay image;

    private FractalGenerator gen;

    private Rectangle2D.Double range;

    private JComboBox<String> fractalChooser;

    private JButton saveButton;

    private JButton resetButton;

    private int rowsRemaining;

    private void enableUI(boolean val) {
        fractalChooser.setEnabled(val);

        saveButton.setEnabled(val);
        resetButton.setEnabled(val);
    }

    private class FractalWorker extends SwingWorker<Object, Object> {

        private int y;

        private int[] RGBVals;

        public FractalWorker(int _y) {
            y = _y;
        }

        public Object doInBackground() {
            RGBVals = new int[displaySize];

            double yCoord = FractalGenerator.getCoord(range.y, range.y + range.height,
                    displaySize, y);

            for (int x = 0; x < displaySize; x++) {

                double xCoord = FractalGenerator.getCoord(range.x, range.x + range.width,
                        displaySize, x);
                int numIters;
                int rgbColor = 0;
                float hue;

                numIters = gen.numIterations(xCoord, yCoord);
                if (numIters >= 0) {
                    hue = 0.7f + numIters / 200f;
                    rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                }

                RGBVals[x] = rgbColor;
            }

            return null;
        }

        public void done() {
            for (int x = 0; x < displaySize; x++) {
                image.drawPixel(x, y, RGBVals[x]);
            }

            image.repaint(0, 0, y, displaySize, 1);

            if (rowsRemaining-- < 1) {
                enableUI(true);
            }
        }
    }

    private class FractalHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if (e.getSource() == fractalChooser) {
                String selectedItem = fractalChooser.getSelectedItem().toString();

                if (selectedItem.equals(Mandelbrot.getString())) {
                    gen = new Mandelbrot();
                } else if (selectedItem.equals(Tricorn.getString())) {
                    gen = new Tricorn();
                } else if (selectedItem.equals(BurningShip.getString())) {
                    gen = new BurningShip();
                } else {
                    JOptionPane.showMessageDialog(null, "Ошибка ввода");
                    return;
                }

                range = new Rectangle2D.Double();
                gen.getInitialRange(range);

                drawFractal();
            } else if (cmd.equals("reset")) {
                range = new Rectangle2D.Double();
                gen.getInitialRange(range);

                drawFractal();
            } else if (cmd.equals("save")) {
                JFileChooser chooser = new JFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG", "png");
                chooser.setFileFilter(filter);
                chooser.setAcceptAllFileFilterUsed(false);

                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    try {
                        File f = chooser.getSelectedFile();
                        String filePath = f.getPath();
                        if (!filePath.toLowerCase().endsWith(".png")) {
                            f = new File(filePath + ".png");
                        }

                        ImageIO.write(image.getImage(), "png", f);
                    } catch (IOException exc) {
                        JOptionPane.showMessageDialog(null, "Ошибка сохранения ( " + exc.getMessage() + " )");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Неизвестная ошибка");
            }
        }
    }

    private class MouseHandler extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {

            if (rowsRemaining > 0) {
                return;
            }

            double xCoord = FractalGenerator.getCoord(range.x, range.x + range.width,
                    displaySize, e.getX());

            double yCoord = FractalGenerator.getCoord(range.y, range.y + range.height,
                    displaySize, e.getY());

            gen.recenterAndZoomRange(range, xCoord, yCoord, 0.5);

            drawFractal();
        }
    }

    public FractalExplorer(int size) {
        this.displaySize = size;

        this.gen = new Mandelbrot();
        this.range = new Rectangle2D.Double();
        this.gen.getInitialRange(this.range);
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Fractal Explorer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new BorderLayout());

        FractalHandler handler = new FractalHandler();

        JPanel fractalPanel = new JPanel();

        JLabel label = new JLabel("Fractal: ");
        fractalPanel.add(label);

        fractalChooser = new JComboBox<String>();
        fractalChooser.addItem(Mandelbrot.getString());
        fractalChooser.addItem(Tricorn.getString());
        fractalChooser.addItem(BurningShip.getString());

        fractalChooser.addActionListener(handler);
        fractalPanel.add(fractalChooser);

        frame.getContentPane().add(fractalPanel, BorderLayout.NORTH);

        image = new JImageDisplay(displaySize, displaySize);
        frame.getContentPane().add(image, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();

        saveButton = new JButton("Сохранить");
        saveButton.setActionCommand("save");
        saveButton.addActionListener(handler);
        buttonsPanel.add(saveButton);

        resetButton = new JButton("Reset Display");
        resetButton.setActionCommand("reset");
        resetButton.addActionListener(handler);
        buttonsPanel.add(resetButton);

        frame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        frame.getContentPane().addMouseListener(new MouseHandler());

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void drawFractal() {
        enableUI(false);

        for (int y = 0; y < displaySize; y++) {
            FractalWorker worker = new FractalWorker(y);
            worker.execute();
        }

        image.repaint();
    }

    public static void main(String[] args) {
        FractalExplorer explorer = new FractalExplorer(800);
        explorer.createAndShowGUI();
        explorer.drawFractal();
    }
}