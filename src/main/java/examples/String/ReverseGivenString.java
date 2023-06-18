package main.java.examples.String;

public class ReverseGivenString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of the string: " + reverse);
    }
}
