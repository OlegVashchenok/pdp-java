package facade;


import java.util.concurrent.LinkedBlockingDeque;

public class Consumer implements Runnable {

    LinkedBlockingDeque<Message> messagesQueue;

    public Consumer(LinkedBlockingDeque<Message> messagesQueue) {
        this.messagesQueue = messagesQueue;
    }

    @Override
    public void run() {
        while (true) {
            if (messagesQueue.isEmpty()) return;
            var message = messagesQueue.poll();
            new DocumentWriter().write(message.getUuid(), new Parser().getDocument(message.getValue()));
        }
    }
}
