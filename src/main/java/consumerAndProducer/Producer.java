package consumerAndProducer;

import java.util.List;

public class Producer {

    private Broker broker = new Broker();

    public Broker getBroker() {
        return broker;
    }

    public Producer(List<Message> messageList) {
        messageList.forEach(message -> broker.addToQueue(message));
    }
}
