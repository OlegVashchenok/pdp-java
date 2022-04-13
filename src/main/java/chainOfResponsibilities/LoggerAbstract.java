package chainOfResponsibilities;

public abstract class LoggerAbstract implements Logger {
    LogLevel level;
    Logger nextLevel;

    public LoggerAbstract(LogLevel level) {
        this.level = level;
    }

    @Override
    public void inform(String message, LogLevel level) {
        if (this.level.getValue() <= level.getValue()) {
            info(message);
        }
        if (nextLevel != null) {
            nextLevel.inform(message, level);
        }
    }

    @Override
    public void setNext(Logger nextLevel) {
        this.nextLevel = nextLevel;
    }
}
