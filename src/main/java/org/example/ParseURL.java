package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParseURL {
    public static Document getSiteCode(String site){
        try {
            Document doc = Jsoup.connect(site)
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();

            Elements aba = doc.select("iframe");

            return doc;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
