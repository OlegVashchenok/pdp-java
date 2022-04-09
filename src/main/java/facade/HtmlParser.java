package facade;

import facade.consumerProducer.Broker;
import facade.consumerProducer.Consumer;
import facade.consumerProducer.Producer;
import facade.writer.DocumentWriter;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser {

    public void parse() {
        var messageList = new ConsoleReader().getMessageList();
        var broker = new Broker();
        new Producer(broker, messageList);
        parseParallel(broker, 3);
        DocumentWriter.archive();
    }


    private static void parseParallel(Broker broker, int count) {
        List<Thread> threadList = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                var thread = new Thread(new Consumer(broker.getMessagesQueue()));
                thread.setDaemon(true);
                System.out.println(thread.getName());
                thread.start();
                threadList.add(thread);
            }
            for (var t : threadList) {
                t.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
