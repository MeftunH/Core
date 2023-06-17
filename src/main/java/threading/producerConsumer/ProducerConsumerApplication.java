package main.java.threading.producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApplication {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread producerThread = new Thread(() -> {
            produce();
        });
        Thread consumerThread = new Thread(() -> {
            consume();
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
            }
        }
    }

    private static void consume() {
        while (true) {
            try {
                Thread.sleep(100);
                Integer value = queue.take();
                System.out.print("Alınansayı:" + value
                        + ",Kuyruğunboyutu:" + queue.size());
            } catch (InterruptedException e) {
            }
        }
    }

}
