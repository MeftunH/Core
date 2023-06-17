package main.java.threading.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private static Account account1 = new Account();

    private static Account account2 = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void firstThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            lock1.lock();
            lock2.lock();

            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
        for (int i = 0; i < 10000; i++) {
            Account.transfer(account1, account2, random.nextInt(100));
        }
    }

    public void secondThread() {
        Random random = new Random();

//        for (int i = 0; i < 10000; i++) {
//            lock1.lock();
//            lock2.lock();
//
//            try {
//                Account.transfer(account2, account1, random.nextInt(100));
//            } finally {
//                lock1.unlock();
//                lock2.unlock();
//            }
//        }
        for (int i = 0; i < 10000; i++) {
            Account.transfer(account2, account1, random.nextInt(100));
        }
    }

    public static void printBalance() {
        System.out.println("Acc 1: " + account1.getBalance());
        System.out.println("Acc 2: " + account2.getBalance());
        System.out.println("Total: " + (account1.getBalance() + account2.getBalance()));
    }

    public static void main(String[] args) {
        Random random = new Random();
        Account.transfer(account1, account2, random.nextInt(100));
        printBalance();
    }

}