import java.net.*;
import java.util.regex.*;

public class URLDepthPair {
    public static String urlReg = "(http?:\\/\\/)((\\w+\\.)+\\.(\\w)+[~:\\S\\/]*)";
    public static Pattern urlPat = Pattern.compile(urlReg, Pattern.CASE_INSENSITIVE);

    private URL URL;
    private int depth;

    public URL getURL() {
        return URL;
    }

    public int getDepth() {
        return depth;
    }

    public String getHost() {
        return URL.getHost();
    }

    public String getDocPath() {
        return URL.getPath();
    }

    public URLDepthPair(URL url, int _depth) throws MalformedURLException {
        URL = new URL(url.toString());
        depth = _depth;
    }

    @Override
    public String toString() {
        return "URL: " + URL.toString() + ", Depth: " + depth;
    }

    public static boolean isAbsolute(String url) {
        Matcher URLChecker = urlPat.matcher(url);
        if (!URLChecker.find()) {
            return false;
        }
        return true;
    }
}