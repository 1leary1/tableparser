package org.example;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


public class Main {

    public static void main(String[] args) throws IOException {

        String url2 = "https://rltbza.db.files.1drv.com/y4m42Eq7W_L6p1oByk5KA8vkpLmT5-Z-R2hyzWRN6K3mUQC0sxgNe_o67Sx0H1nSTR8RanoFYOPgwrZCylsjQZBlvlp6Ay7UtDTRZET0NGR0wQMATgZpOxDdwOHKg3LGCubePSCI2vItNDxT8D5QLPxxDI5BduyAJR7jXuNYL_gr40";
        Downloader2.getTable(url2);
    }
}