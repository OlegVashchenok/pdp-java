package facade;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {


        public Document getDocument (String url) {
            Document doc = null;
            try {
                doc = Jsoup.connect(url).get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return doc;
        }
}
