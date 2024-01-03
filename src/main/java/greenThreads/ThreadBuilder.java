package main.java.greenThreads;

public class ThreadBuilder {
    public static void main(String[] args) throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("Virtual Thread", 0);
        Runnable task = () -> System.err.println("Hello World: " + Thread.currentThread().threadId());

        Thread thread1 = builder.start(task);
        Thread thread2 = builder.start(task);
        thread1.join();
        thread2.join();
    }
}
