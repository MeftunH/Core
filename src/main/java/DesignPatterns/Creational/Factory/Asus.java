package DesignPatterns.Creational.Factory;

public class Asus implements Computer {
    @Override
    public void name() {
        System.out.println("Asus");
    }

    @Override
    public void since(int year) {
        System.out.println("Since " + year);
    }
}
