package facade.writer;

import net.lingala.zip4j.ZipFile;
import org.apache.commons.lang3.RandomStringUtils;
import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DocumentWriter {

    private static final String path = "src/main/java/facade/html/";

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

    public static void archive() {
        try {
            new ZipFile( RandomStringUtils.randomAlphanumeric(5) + ".zip")
                    .addFolder(new File(path));
            delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void delete() {
        var file = new File(path);
        for (var f : file.listFiles()) {
            f.delete();
        }
    }
}
