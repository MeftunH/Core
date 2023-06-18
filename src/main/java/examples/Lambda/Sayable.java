package main.java.examples.Lambda;

public class Sayable {
    public static void main(String[] args) {
        ISayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }

}
