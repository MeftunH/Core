package examples.Recursion;

public class PrintFibonacciRecursive {

    public static void printFibonacciSequence(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(10);
    }
}
