package main.java.threading.SecondThreadSync.sync.syncBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyncBlockApplication {
    private List<Integer> list1 = new ArrayList<>();

    private List<Integer> list2 = new ArrayList<>();

     private Object lock1 = new Object();

        private Object lock2 = new Object();

    public static void main(String[] args) {
        SyncBlockApplication app = new SyncBlockApplication();

        long startTime = System.currentTimeMillis();

        app.work();

        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));
        System.out.println("List 1 size : " + app.list1.size());
        System.out.println("List 2 size : " + app.list1.size());
    }

    private void work() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
        }

    }

    private void process() {
        for (int i = 0; i < 1000; i++) {
            addNewIntegerToList1();
            addNewIntegerToList2();
        }
    }

//    private void addNewIntegerToList1() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//        }
//
//        list1.add(new Random().nextInt());
//    }
//
//    private void addNewIntegerToList2() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//        }
//
//        list2.add(new Random().nextInt());
//    }
   //iki thread ayni anda erismeye kalkabiliyor o yuzden sync yap ama bu sefer de calisma suren iki katina cikar?
    //private synchronized void addNewIntegerToList1() {
    //    try {
    //        Thread.sleep(1);
    //    } catch (InterruptedException e) {
    //    }
    //
    //    list1.add(new Random().nextInt());
    //}
    //
    //private synchronized void addNewIntegerToList2() {
    //    try {
    //        Thread.sleep(1);
    //    } catch (InterruptedException e) {
    //    }
    //
    //    list2.add(new Random().nextInt());
    //}



//     private void addNewIntegerToList1() {
//            synchronized (lock1) {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                }
//
//                list1.add(new Random().nextInt());
//            }
//        }
//
//        private void addNewIntegerToList2() {
//            synchronized (lock2) {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                }
//
//                list2.add(new Random().nextInt());
//            }
//        }



     private void addNewIntegerToList1() {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }

                list1.add(new Random().nextInt());
            }
        }

        private void addNewIntegerToList2() {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }

                list2.add(new Random().nextInt());
            }
        }
}
