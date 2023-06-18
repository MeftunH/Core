package main.java.examples.Array;

public class ReturnArray {
    static int[] m1() {
        return new int[]{10, 22, 44, 66};
    }

    public static void main(String[] args) {
        int[] arr = m1();
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
