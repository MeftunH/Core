package DesignPatterns.Creational.AbstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Animal")) {
            return new AnimalFactory();
        }
        return null;
    }
}
