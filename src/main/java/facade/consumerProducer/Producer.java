package facade.consumerProducer;

import facade.Message;

import java.util.List;

public class Producer {

    public Producer(Broker broker , List<Message> messageList) {
        messageList.forEach(broker::addToQueue);
    }
}
