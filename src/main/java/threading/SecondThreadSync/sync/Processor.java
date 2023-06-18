package main.java.threading.SecondThreadSync.sync;
/*
Ayni veri ile ilgilenen birden fazla threadin veriye erisiminin duzenlenmesine threadlerin
senkronizasyonu denir.
Senronizasyon konusundaki ilk sorun verinin performans gerekcesiyle auto olarak cachelenmesi.
 */
class Processor extends Thread {


/*

 */

/*
suanki haliyle thread sonsuza kadar hi yazar cunku running'imiz true'dur
 */
private boolean running = true;



    @Override
    public void run() {
        while (running) {
            System.out.println("Hi processor:");
        }
    }
    //threadi sonlandiracak olan metod
    public void shutdown() {
        this.running = false;
    }

/*Bu yapida karsilasacagimiz tehlike su,bazi java gerceklemelerinde running degiskeni
disardan bir mudaheleyle degistirlmeyecegini varsayimindan yola cikarak onun degerini auto olarak cache'e atar
ve her zaman degeri true imiscesine davranir.Bur duruma "CACHING THREAD LOCALLY" tabiriyle ifade edilir
Eger bu caching durumu bizim programimiz icin tutarsizlik yaratacaksa volatile anahtar kelimesi kullanilmalidir
Volatile ona her basvurdugumuzda degiskenin cache degeri yerine o anki gercek degerini doner.Boylece kodumuzun tum
sistemlerdeki tum java gerceklestirimlerinde calisacagini garanti etmis oluruz
 */
//private volatile boolean running = true;
    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();

        processor.start();

        Thread.sleep(3000);

        processor.shutdown();
    }
}
