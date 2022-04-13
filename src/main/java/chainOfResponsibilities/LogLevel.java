package chainOfResponsibilities;

public enum LogLevel {

    FATAL(4),
    ERROR(3),
    WARM(2),
    INFO(1);

    private final int i;

    LogLevel(final int i) {
        this.i = i;
    }
    public int getValue() {
        return i;
    }
}
