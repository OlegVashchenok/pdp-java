package chainOfResponsibilities;

public class ConsoleLogger extends LoggerAbstract {

    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println("Логирование в консоль: " + message);
    }
}
