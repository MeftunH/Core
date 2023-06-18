package main.java.examples.Recursion;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ClimbStairs {
    public int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
    public int climbStairsDP(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairsDP(5));
    }

}
