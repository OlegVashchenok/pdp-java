package consumerAndProducer;

import java.util.List;

public interface IDataSource {

    List<Message> getMessageList();
}
