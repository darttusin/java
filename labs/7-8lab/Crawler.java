import java.net.*;

public class Crawler {
    private URLPool pool;

    public Crawler(String hostUrl, int depth) throws MalformedURLException {
        pool = new URLPool(depth);
        URL rootURL = new URL(hostUrl);
        pool.add(new URLDepthPair(rootURL, 0));
    }

    public void crawl() {
        for (int i = 0; i < 12; i++) {
            CrawlerTask crawler = new CrawlerTask(pool);
            Thread thread = new Thread(crawler);
            thread.start();
        }

        while (pool.getWaitCount() != 12) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        pool.printURLs();
    }

    public static void main(String[] args) {
        args = new String[] { "http://info.cern.ch/", "1" };
        if (args.length != 2) {
            System.err.println("Аргументы: <URL> <Depth>");
            System.exit(1);
        }
        try {
            Crawler crawler = new Crawler(args[0], Integer.parseInt(args[1]));
            crawler.crawl();
        } catch (MalformedURLException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.exit(0);
    }
}