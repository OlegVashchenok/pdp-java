package facade;

public class Main {
    public static void main(String[] args) {
        var message = new ConsoleReader().getMessage();
        var doc = new Parser().getDocument(message.getValue());
        new DocumentWriter().write(message.getUuid(), doc);
    }
}
