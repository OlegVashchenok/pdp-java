package chainOfResponsibilities;

public class FileLogger extends LoggerAbstract {

    public FileLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println("Логированние в файл: " + message);
    }
}
