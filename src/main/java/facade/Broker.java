package facade;

import java.util.concurrent.LinkedBlockingDeque;

public class Broker {

    LinkedBlockingDeque<Message> messagesQueue = new LinkedBlockingDeque<>();

    public Broker() {
    }

    public LinkedBlockingDeque<Message> getMessagesQueue() {
        return messagesQueue;
    }

    public void addToQueue(Message message) {
        messagesQueue.add(message);
    }
}
