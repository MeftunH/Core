package main.java.threading.waitAndNotify;

import java.util.Scanner;

public class WaitAndNotifyProcessor {
//    Object lockObject = new Object();
    public void produce() throws InterruptedException {
//        synchronized (lockObject)
        synchronized (this) {
            System.out.println("Produce thread working...");
            wait();
//            lockObject.wait();
            System.out.println("Produce thread still working...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Consumer thread working...");
            System.out.print("Put enter to continue: ");
            scanner.nextLine();
            System.out.println("Consumer is continue...");
            notify();
            Thread.sleep(3000);
            System.out.println("Consumer continue till 3 secs.");
        }
    }
}
