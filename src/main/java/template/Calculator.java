package template;

public class Calculator extends ConsoleProgram {

    public static void main(String[] args) {
        new Calculator().run("Введите метематическую операцию:");
    }

    @Override
    public String makeOperation(String request) {
        var operand1 = Integer.parseInt(request.split("[+\\-*/]")[0]);
        var operand2 = Integer.parseInt(request.split("[+\\-*/]")[1]);
        var operator = request.split("(?<=[-+*/])|(?=[-+*/])")[1];
        switch (operator) {
            case "+":
               return Integer.toString( operand1 + operand2);
            case "-":
                return Integer.toString( operand1 - operand2);
            case "*":
                return Integer.toString(operand1 * operand2);
            case "/":
                return Double.toString(operand1 / operand2);
            case "%":
                return Integer.toString(operand1 % operand2);
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
}
