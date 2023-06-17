package main.java.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncExample {
    public static void main(String[] args) {
        System.out.println("Program is start.");


        performTask();

        System.out.println("Program is  continue.");


    }
    public static void performTask() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() ->

        {
            System.out.println("Task is start.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Task is done.");
        });
        executorService.shutdown();

    }
}
