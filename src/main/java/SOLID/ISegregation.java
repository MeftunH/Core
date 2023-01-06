package SOLID;

public class ISegregation {
    interface Flyable {
        void fly();
    }
     interface Runnable {
        void run();
    }
     interface Barkable {
        void bark();
    }
    class Bird implements Flyable, Runnable {
        public void run() {
            System.out.println("Kuş,Koşuyorum");
            //logic
        }

        public void fly() {
            System.out.println("Kuş, Uçuyorum.");
            //logic
        }
    }
    //---------------------------------------------------------
    class Cat implements Runnable {
        public void run() {
            System.out.println("Kedi,Koşuyorum");
            //logic
        }
    }
    //---------------------------------------------------------
    class Dog implements Barkable, Runnable {
        public void run() {
            System.out.println("Köpek,Koşuyorum");
            //logic
        }

        public void bark() {
            System.out.println("Köpek,Havlıyorum");
            //logic
        }
    }
}
