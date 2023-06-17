package main.java.threading.callableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Application {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future future = executorService.submit(new Callable<Object>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                return random.nextInt();
            }
        });

        executorService.shutdown();
//
//        try {
////            Integer result = future.get(10, TimeUnit.MILLISECONDS);
////            Integer result = (Integer) future.get();
////            System.out.println("Result : " + result);
//        }
////        Integer result = future.get(10, TimeUnit.MILLISECONDS);
//        catch (InterruptedException e) {
//            System.out.println("Exception!");
//        } catch (InterruptedException e) {
//        }
    }

}
