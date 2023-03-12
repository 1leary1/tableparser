package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static String standardUrl = "https://onedrive.live.com/redir?resid={resid}&authkey={authkey}&page=Download";
    public static final String site = "https://www.ompec.ru/student/uchebnaya-deyatelnost/izmeneniya-v-raspisanii.php";
    public static Elements aba;

    public static void main(String[] args) {
        Document page = ParseURL.getPageCode(site);
        Elements elements = page.select("iframe");
        System.out.println(elements);

        String resid = "";
        String authkey = "";

        Matcher residMatcher = Pattern.compile("resid=\\S*?&amp").matcher(String.valueOf(elements));
        if (residMatcher.find()) resid = residMatcher.group().replace("resid=","");

        Matcher authMatcher = Pattern.compile("authkey=\\S*?&amp").matcher(String.valueOf(elements));
        if (authMatcher.find()) authkey = authMatcher.group().replace("authkey=","");

        System.out.println("authkey бля = "+authkey+"\n"+ "resid нах = "+ resid);

    }
}