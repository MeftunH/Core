package main.java.examples.Concurrency;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.concurrent.Executors;

public class ExecutorService {
    public static void main(String[] args) {
        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                // code to be executed concurrently
            });
        }
        executorService.shutdown();
    }
}
