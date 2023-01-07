package DesignPatterns.Creational.Factory;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Computer mac = ComputerFactory.createComputer(Mac.class);
        mac.name();
        mac.since(1984);

        Computer asus = ComputerFactory.createComputer(Asus.class);
        asus.name();
        asus.since(1981);
    }
}
