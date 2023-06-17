package main.java.threading.interrupting;

import java.util.Random;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start.");

        Thread t = new Thread(() -> {
            for (int i = 0; i < 1E8; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread interrupted!");
                    break;
                }
                Math.sin(new Random().nextDouble());
            }
        });

        t.start();

        Thread.sleep(500);

        t.interrupt();

        t.join();

        System.out.println("Finish.");
    }

}
