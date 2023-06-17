package main.java.threading.waitAndNotify;

public class WaitAndNotifyApplication {


    public static void main(String[] args) throws InterruptedException {
        final WaitAndNotifyProcessor processor = new WaitAndNotifyProcessor();

        Thread producerThread = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }

}
