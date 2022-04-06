package consumerAndProducer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var messageList = new ConsoleReader().getMessageList();
        Producer prod = new Producer(messageList);
        var broker = prod.getBroker();
        long time = System.currentTimeMillis();
        parseParallel(broker, 10);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static void parseParallel(Broker broker, int count) {
        List<Thread> threads = new ArrayList<>();
        try {
            for (int i = 0; i <= count; i++) {
                var thread = new Thread(new Consumer(broker.getMessagesQueue()));
                thread.setDaemon(true);
                thread.start();
                threads.add(thread);
            }
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
