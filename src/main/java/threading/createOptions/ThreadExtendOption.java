package main.java.threading.createOptions;

public class ThreadExtendOption extends Thread {
    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi:  " + i + " - " + this.getName());
        }
    }
}
