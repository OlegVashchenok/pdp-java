package consumerAndProducer;

import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DocumentWriter {

    private static final String path = "/Users/olegvashchenok/PdpTasks/src/main/java/facade/html/";

    public void write(String fileName, Document doc) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path + fileName));
            writer.write(doc.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Проблема гдето в записе файла");
            e.printStackTrace();
        }
    }
}
