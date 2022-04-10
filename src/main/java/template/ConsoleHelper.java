package template;

import java.util.Scanner;

public class ConsoleHelper {

    public String getMessage(String text) {
        System.out.println(text);
        return new Scanner(System.in).nextLine();
    }

    public void writeMessage(String message) {
        System.out.println(message);
    }
}
