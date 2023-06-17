package main.java.threading;

public class SyncExample {
    public static void main(String[] args) {
        System.out.println("Program is start.");

        performTask();

        System.out.println("Program is done.");
    }

    public static void performTask() {
        System.out.println("Task is start.");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task is done.");
    }
}
