package DesignPatterns.Creational.Factory;

public class Mac implements Computer {
    @Override
    public void name() {
        System.out.println("Mac");
    }

    @Override
    public void since(int year) {
        System.out.println("Since " + year);
    }
}
