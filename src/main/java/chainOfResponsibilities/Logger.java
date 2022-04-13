package chainOfResponsibilities;

public interface Logger {

    void setNext(Logger nextLevel);

    void inform(String message, LogLevel level);

    void info(String message);
}