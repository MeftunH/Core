package main.java.effectiveJava.chapterFiftyThree;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
