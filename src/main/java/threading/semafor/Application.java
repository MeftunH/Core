package main.java.threading.semafor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                try {
                    Connection.getInstance().connect();
                } catch (InterruptedException e) {
                }
            });
        }

        executorService.shutdown();
    }

}