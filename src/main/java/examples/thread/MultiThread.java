package main.java.examples.thread;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello: " + i);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello: " + i);
                }
            }
        });
    }

}
