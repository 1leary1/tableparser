package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static String standardUrl = "https://onedrive.live.com/redir?resid={resid}&authkey={authkey}&page=Download";
    public static String site = "https://www.ompec.ru/student/uchebnaya-deyatelnost/izmeneniya-v-raspisanii.php";
    public static Elements aba;
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.ompec.ru/student/uchebnaya-deyatelnost/izmeneniya-v-raspisanii.php")
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();

            aba = doc.select("iframe");
            System.out.println(aba);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}