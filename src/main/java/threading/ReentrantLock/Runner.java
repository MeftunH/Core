package main.java.threading.ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;

    private Lock lock = new ReentrantLock();
//    private Condition condition = lock.newCondition();
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

//    public void firstThread() throws InterruptedException {
////        System.out.println("Thread 1 working...");
////
////        condition.await();
////
////        System.out.println("Thread 1 still working...");
//        lock.lock();
//        try {
//            increment();
//        } finally {
//            lock.unlock();
//        }
//    }

//    public void secondThread()  throws InterruptedException {
//        lock.lock();
//        try {
//            increment();
//        } finally {
//            lock.unlock();
//        }
//    }

//    public void secondThread() throws InterruptedException {
//        Thread.sleep(2000);
//
//        lock.lock();
//
//        System.out.println("Thread 2 working...");
//        System.out.print("Press Enter: ");
//
//        new Scanner(System.in).nextLine();
//
//        condition.signal();
//
//        System.out.println("Thread 2 still working...");
//
//        try {
//            increment();
//        } finally {
//            lock.unlock();
//        }
//    }


    public void printCount() {
        System.out.println("iterator: " + count);
    }

}

