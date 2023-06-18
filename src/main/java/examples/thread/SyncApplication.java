package main.java.examples.thread;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class SyncApplication {

    private int count = 0;

    public static void main(String[] args) {
        SyncApplication application = new SyncApplication();
        application.doCount();
    }

    public synchronized void increment() {
        count++;
    }

    private void doCount() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
    }

}
