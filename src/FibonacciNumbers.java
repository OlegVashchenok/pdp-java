public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci2(10));
        System.out.println(factorial(10));
    }

    public static long fibonacci(int n) {
        long result = 1;
        if (n == 1 || n == 2) return result;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacci2(int n) {
        long num1 = 1;
        long num2 = 1;
        long sum = 0;
        for (int i = 0; i < n - 2; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}