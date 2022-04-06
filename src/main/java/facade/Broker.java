package facade;

import java.util.ArrayDeque;
import java.util.Queue;

public class Broker {

    Queue<Message> messagesQueue = new ArrayDeque<>();

    public Broker() {
    }

    public Queue<Message> getMessagesQueue() {
        return messagesQueue;
    }

    public void addToQueue(Message message) {
        messagesQueue.add(message);
    }

    public int isQueueEmpty() {
        return messagesQueue.size();
    }
}
