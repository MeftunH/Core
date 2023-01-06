package OOP.Abstraction;

abstract class BikeTwo {
    BikeTwo(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
class Honda extends BikeTwo {
    void run(){
        System.out.println("running safely..");
    }
}

class Main {
    public static void main(String[] args) {
        BikeTwo obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
