package chainOfResponsibilities;

public class CallLogger extends LoggerAbstract {
    public CallLogger(LogLevel level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println(" " + message);
    }
}
