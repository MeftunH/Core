package main.java.examples.Recursion.factorial;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

