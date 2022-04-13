package chainOfResponsibilities;

public class MessageLogger extends LoggerAbstract {
    public MessageLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println("Send SMS to CEO: " + message);
    }
}
