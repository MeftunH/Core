package main.java.threading.createOptions;

public class RunnableOption implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi Runnable:  " + i);
        }
    }
}
