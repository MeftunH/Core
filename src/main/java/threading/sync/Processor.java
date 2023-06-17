package main.java.threading.sync;

class Processor extends Thread {

    private volatile boolean running = true;

//    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hi processor:");
        }
    }
    public void shutdown() {
        this.running = false;
    }


    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();

        processor.start();

        Thread.sleep(3000);

        processor.shutdown();
    }
}
