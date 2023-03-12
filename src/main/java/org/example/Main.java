package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Main {
    public static String standardUrl = "https://onedrive.live.com/redir?resid={resid}&authkey={authkey}&page=Download";
    public static final String site = "https://www.ompec.ru/student/uchebnaya-deyatelnost/izmeneniya-v-raspisanii.php";
    public static Elements aba;

    public static void main(String[] args) {
        Document page = ParseURL.getPageCode(site);
        Elements elements = page.select("iframe");
    }
}