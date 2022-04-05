package facade;

import java.util.Scanner;

public class ConsoleReader implements IDataSource{

    @Override
    public Message getMessage() {
        System.out.println("Введити в консоль одну ссылку: ");
        String url = new Scanner(System.in).nextLine();
        var message = new Message(url);
        System.out.println("Название файла -> " + message.getUuid());
        return message;
    }
}
