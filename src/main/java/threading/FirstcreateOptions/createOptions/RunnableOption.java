package main.java.threading.FirstcreateOptions.createOptions;

/*
Thread olusturmanin ikinci yolu,runnable interfaceini implement eden sinif ornegidir.
 */

public class RunnableOption implements Runnable {
    /*Thread'in yapacagi is
    Sonraki adimda thradimizi test etmek icfin main metoduna sahip bir sinif olusturkam olacaktir.
     Thread Application
    sinifimiz bu ise yariyacaktir
    */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi Runnable:  " + i);
        }
    }
}
