package facade;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {


        public Document getDocument (String url) {
            Document doc = null;
            try {
                doc = Jsoup.connect("http://example.com/").get();
                System.out.println(doc);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return doc;
        }
}
