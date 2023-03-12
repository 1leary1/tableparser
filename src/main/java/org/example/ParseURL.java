package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseURL {
    public static Document getPageCode(String site) {
        try {
            Document doc = Jsoup.connect(site)
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();

            return doc;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getResid(Elements elements) {
        String resid = "";

        Matcher residMatcher = Pattern.compile("resid=\\S*?&amp").matcher(String.valueOf(elements));
        if (residMatcher.find()) resid = residMatcher.group().replace("resid=", "");

        return resid;
    }

    public static String getAuthkey(Elements elements) {
        String authkey = "";

        Matcher authMatcher = Pattern.compile("authkey=\\S*?&amp").matcher(String.valueOf(elements));
        if (authMatcher.find()) authkey = authMatcher.group().replace("authkey=", "");

        return authkey;
    }

    public static String GetURL(String resid, String authkey) {
        String URL = MessageFormat.format("https://onedrive.live.com/redir?resid={0}&authkey={1}&page=Download", resid, authkey);
        return URL;
    }

}
