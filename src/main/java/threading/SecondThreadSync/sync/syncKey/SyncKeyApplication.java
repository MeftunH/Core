package main.java.threading.SecondThreadSync.sync.syncKey;

public class SyncKeyApplication {
    private int count = 0;


//    public void increment() {
//        count++;
//    }

public synchronized void increment() {
    count++;
}

    public static void main(String[] args) {
        SyncKeyApplication application = new SyncKeyApplication();
        application.doCount();
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
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    count++;
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    count++;
//                }
//            }
//        });

        thread1.start();
        thread2.start();

        System.out.println("Iterator : " + count);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
        }

        System.out.println("Iterator: " + count);
    }


}
