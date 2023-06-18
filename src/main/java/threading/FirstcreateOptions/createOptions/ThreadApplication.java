package main.java.threading.FirstcreateOptions.createOptions;

/*
Thread olusturmanin 2 yolu vardir ilk yol thread sinifini extend eden bir sinif olusturmak ve run metodunu implenet emtke
Bu sinif icinde threadlerimiz uzerinde cesitli deneyler yapacagiz.
 */

public class ThreadApplication {
    public static void main(String[] args) {
        //instance olusturuyoruz
//        ThreadExtendOption runner = new ThreadExtendOption();
/*Threadi calistirmak icin run metodu yerine start metodu kullandigimiz icin runnerin ifade ettigi islem
  o adnki thread icerisinde yani main metodunu calistiran ana thread icinde calisacaktir.
  */
//        runner.run();
        /*
        Start metodunu kullanmamiz halinde ise runnerin ifade ettigi islemler kendi threadi icerisinde
        calisacaktir
         */
//        runner.start();


//        ThreadExtendOption runner1 = new ThreadExtendOption();
//        ThreadExtendOption runner2 = new ThreadExtendOption();

            /* Multi thread yapilarina girdigimiz halde ciktimiz bizi biraz suprize ugratabiliriz
        Hi:  0 - Thread-0
Hi:  0 - Thread-0
Hi:  0 - Thread-1
Hi:  1 - Thread-1
Hi:  1 - Thread-0
Hi:  2 - Thread-1
Hi:  3 - Thread-1
Hi:  2 - Thread-0
Hi:  4 - Thread-1
Hi:  5 - Thread-1
Hi:  6 - Thread-1
Hi:  3 - Thread-0
Hi:  7 - Thread-1
Hi:  4 - Thread-0
Hi:  8 - Thread-1
Hi:  9 - Thread-1
Hi:  5 - Thread-0
Hi:  6 - Thread-0
Hi:  7 - Thread-0
Hi:  8 - Thread-0
Hi:  9 - Thread-0
Ciktindan da anlayabilecegimiz uzere ilk threadimiz ikinci threadi beklemedi.Senkronizasyonumuz isleri 2T yerine
T zamanda bitirmek istedigi icin threadi beklemeye almadi
         */
//        runner1.start();
//        runner2.start();
/*
start yerine run kullanmis olsaydik islemler ayri threadler yerine o anki thread icinde calistirilacagi icin iki
 Runner degiskeninin isleri her zaman sirali calisacakti.Yani once ilk instance sonra ikinci instance kendi uzerine
 dusen isi yapacakti.Buradaki ciktimiz
 Hi:  0 - Thread-0
Hi:  1 - Thread-0
Hi:  2 - Thread-0
Hi:  3 - Thread-0
Hi:  4 - Thread-0
Hi:  5 - Thread-0
Hi:  6 - Thread-0
Hi:  7 - Thread-0
Hi:  8 - Thread-0
Hi:  9 - Thread-0
Hi:  0 - Thread-1
Hi:  1 - Thread-1
Hi:  2 - Thread-1
Hi:  3 - Thread-1
Hi:  4 - Thread-1
Hi:  5 - Thread-1
Hi:  6 - Thread-1
Hi:  7 - Thread-1
Hi:  8 - Thread-1
Hi:  9 - Thread-1
seklinde olacakti.
 */
//        runner1.run();
//        runner2.run();
        //runnable ile thread olusturmak icin thread sinifinin constructoruna runnable'in impl. eden sinif ornegini yazariz
        Thread thread1 = new Thread(new RunnableOption());
        Thread thread2 = new Thread(new RunnableOption());
        //yine ilk ornegimizde oldugu gibi burada da cikti sirasi unsync sekilde olacaktir.
        thread1.start();
        thread2.start();

    }
}
