package examples.thread;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Application {
    public static void main(String[] args) {
//        Runner runner = new Runner();
//
//        runner.start();
        //Multithreading
        Runner runner1=new Runner();
        Runner runner2=new Runner();

        runner1.start();
        runner2.start();

        Thread thread1 = new Thread(new RunnableRunner());
        Thread thread2 = new Thread(new RunnableRunner());

        thread1.start();
        thread2.start();
    }
}
