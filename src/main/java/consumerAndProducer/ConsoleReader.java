package consumerAndProducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleReader implements IDataSource {

    @Override
    public List<Message> getMessageList() {
        System.out.println("Введити в консоль одну ссылку: ");
        String urls = new Scanner(System.in).nextLine();
        var list = Arrays.stream(urls.split(",")).collect(Collectors.toList());
        List<Message> messageList = new ArrayList<>();
        for (var l : list) {
            messageList.add(new Message(l));
        }
        System.out.println("Название файлов:");
        messageList.stream().forEach(message -> System.out.println(message.getUuid()));
        return messageList;
    }
}
