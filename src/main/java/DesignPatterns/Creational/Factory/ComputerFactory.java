package DesignPatterns.Creational.Factory;

public class ComputerFactory {
    public static Computer createComputer(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Computer) aClass.newInstance();
    }
}
