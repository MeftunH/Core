package main.java.greenThreads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Executor {
    public static void main(String[] args) {
        Thread.Builder builder = Thread.ofVirtual().name("Virtual Thread", 0);
        Runnable task = () -> System.err.println("Hello World: " + Thread.currentThread().threadId());

        Thread thread1 = builder.start(task);
        Thread thread2 = builder.start(task);
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }
    }
}
