package DesignPatterns.Creational.AbstractFactory;

public interface AbstractFactory<A> {
    Animal createAnimal(String animalType);
}
