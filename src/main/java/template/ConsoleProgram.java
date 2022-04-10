package template;

abstract class ConsoleProgram {

    public String getRequest(String message) {
       return new ConsoleHelper().getMessage(message);
    }

    abstract String makeOperation(String request);

    public void returnResult(String result) {
        new ConsoleHelper().writeMessage(result);
    }

    void run(String message) {
        var str = getRequest(message);
        var result = makeOperation(str);
        returnResult(result);
    }
}
