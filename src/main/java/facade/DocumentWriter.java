package facade;

import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DocumentWriter {

    public void write(String fileName, Document doc) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(doc.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Проблема гдето в записе файла");
            e.printStackTrace();
        }
    }
}
