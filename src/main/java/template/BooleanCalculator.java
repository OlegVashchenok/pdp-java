package template;

public class BooleanCalculator extends ConsoleProgram {

    public static void main(String[] args) {
        new BooleanCalculator().run("Введите булевую операцию:");
    }

    @Override
    public String makeOperation(String request) {
        var operator = request.replaceAll("\\d", "");
        var operand1 = Integer.parseInt(request.split(operator)[0]);
        var operand2 = Integer.parseInt(request.split(operator)[1]);
        switch (operator) {
            case ">":
                return Boolean.toString(operand1 > operand2);
            case "<":
                return Boolean.toString(operand1 < operand2);
            case "!=":
                return Boolean.toString(operand1 != operand2);
            case "==":
                return Boolean.toString(operand1 == operand2);
            case ">=":
                return Boolean.toString(operand1 >= operand2);
            case "<=":
                return Boolean.toString(operand1 <= operand2);
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
}
