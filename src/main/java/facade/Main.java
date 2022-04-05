package facade;

public class Main {
    public static void main(String[] args) {
        var message = new ConsoleReader().getMessageList();
       message.forEach(message1 -> {
           new DocumentWriter().write(message1.getUuid(), new Parser().getDocument(message1.getValue()));
       });

    }
}
