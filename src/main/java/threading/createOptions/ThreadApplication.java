package main.java.threading.createOptions;

public class ThreadApplication {
    public static void main(String[] args) {
//        ThreadExtendOption runner = new ThreadExtendOption();

//        runner.start();

        ThreadExtendOption runner1 = new ThreadExtendOption();
        ThreadExtendOption runner2 = new ThreadExtendOption();

        runner1.start();
        runner2.start();
//
//        runner1.run();
//        runner2.run();
    }
}
