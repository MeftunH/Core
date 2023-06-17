package main.java.threading.semafor;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();

    private int connectionCount = 0;

    private Semaphore semaphore = new Semaphore(3);

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() throws InterruptedException {
        semaphore.acquire();

        try {
            doConnect();
        } finally {
            semaphore.release();
        }
    }

    private void doConnect() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println("Connection count: " + connectionCount);
        }

        Thread.sleep(1000);

        synchronized (this) {
            connectionCount--;
        }
    }

}