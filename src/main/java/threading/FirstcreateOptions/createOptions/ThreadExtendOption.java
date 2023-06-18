package main.java.threading.FirstcreateOptions.createOptions;
/*
Thread olusturmanin ilk yolu thread sinifini extend eden bir sinif olusturup threadin yapamasini istedigimiz isi
bu metodun icine kodlamaktir
 */
public class ThreadExtendOption extends Thread {
    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi:  " + i + " - " + this.getName());
        }
    }
}
