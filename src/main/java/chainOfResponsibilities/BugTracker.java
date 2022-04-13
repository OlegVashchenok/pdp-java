package chainOfResponsibilities;


public class BugTracker {
    public static void main(String[] args) {
        Logger logger3 = new CallLogger(LogLevel.FATAL);
        Logger logger2 = new MessageLogger(LogLevel.ERROR);
        Logger logger1 = new ConsoleLogger(LogLevel.WARM);
        Logger logger0 = new FileLogger(LogLevel.INFO);

        logger3.setNext(logger2);
        logger2.setNext(logger1);
        logger1.setNext(logger0);

        logger3.inform("Работа выполнилась", LogLevel.INFO);
        logger3.inform("Что-то тут странно", LogLevel.WARM);
        logger3.inform("Алярм тут ошибка", LogLevel.ERROR);
        logger3.inform("Все плохо", LogLevel.FATAL);
    }
}
