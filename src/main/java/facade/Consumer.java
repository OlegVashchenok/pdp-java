package facade;


public class Consumer implements Runnable {

    private Producer prod;

    public Consumer(Producer prod) {
        this.prod = prod;
    }

    @Override
    public void run() {
        while (true) {
            if (prod.getBroker().isQueueEmpty() == 0) return;
            var message = prod.getBroker().getMessagesQueue().remove();
            new DocumentWriter().write(message.getUuid(), new Parser().getDocument(message.getValue()));
        }
    }
}
