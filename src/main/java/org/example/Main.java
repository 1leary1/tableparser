package org.example;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {
    private static final String site = "https://www.ompec.ru/student/uchebnaya-deyatelnost/izmeneniya-v-raspisanii.php";
    private static String url;

    public static void main(String[] args) throws IOException {
        Document page = ParseURL.getPageCode(site);
        Elements elements = page.select("iframe");

        url = ParseURL.GetURL(ParseURL.getResid(elements), ParseURL.getAuthkey(elements));
        System.out.print(url);

        Downloader.downloadFile(url, "file.xlsx");
    }
}