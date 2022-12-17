import java.util.*;

public class URLPool {
    private int taskWaitCount = 0;

    private int maxDepth;

    private LinkedList<URLDepthPair> forProcessURLs;

    private LinkedList<URLDepthPair> inProcessURLs;

    private HashSet<String> unrepeatedURLs;

    public URLPool(int _maxDepth) {
        forProcessURLs = new LinkedList<URLDepthPair>();
        inProcessURLs = new LinkedList<URLDepthPair>();
        unrepeatedURLs = new HashSet<String>();

        maxDepth = _maxDepth;
    }

    public int getWaitCount() {
        synchronized (this) {
            return taskWaitCount;
        }
    }

    public URLDepthPair get() {
        synchronized (this) {
            while (forProcessURLs.size() == 0) {
                taskWaitCount++;
                try {
                    wait();
                } catch (InterruptedException e) {
                }
                taskWaitCount--;
            }

            return forProcessURLs.removeFirst();
        }
    }

    public void add(URLDepthPair nextPair) {
        synchronized (this) {
            String url = nextPair.getURL().toString();
            String cut;
            if (url.endsWith("/")) {
                cut = url.substring(0, url.length() - 1);
            } else {
                cut = url;
            }

            if (unrepeatedURLs.contains(cut)) {
                return;
            }
            unrepeatedURLs.add(cut);

            if (nextPair.getDepth() < maxDepth) {
                forProcessURLs.add(nextPair);
                notify();
            }
            inProcessURLs.add(nextPair);
        }
    }

    public void printURLs() {
        synchronized (this) {
            while (!inProcessURLs.isEmpty()) {
                System.out.println(inProcessURLs.removeFirst());
            }
        }
    }
}