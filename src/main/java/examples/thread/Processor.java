package examples.thread;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

class Processor extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello Processor");
        }
    }
    public void shutdown() {
        this.running = false;
    }
}