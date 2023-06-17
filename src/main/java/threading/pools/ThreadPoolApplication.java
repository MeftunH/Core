package main.java.threading.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolApplication {
    public static void main(String[]args){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            executorService.submit(new ThreadPoolProcessor(i));
        }
        executorService.shutdown();
        System.out.println("all tasks added.");
        try{
            executorService.awaitTermination(1, TimeUnit.DAYS);
        }catch(InterruptedException e){
        }
        System.out.println("all tasks done.");
    }

}
