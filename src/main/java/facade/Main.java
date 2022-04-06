package facade;

public class Main {
    public static void main(String[] args) {
        var messageList = new ConsoleReader().getMessageList();
        Producer prod = new Producer(messageList);
        Consumer consumer = new Consumer(prod);
        consumer.run();

    }
}
