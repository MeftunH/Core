package DesignPatterns.Creational.Prototype;

public class Prototype {
    public static void main(String[] args) {
        // Create a new instance of the prototype
        Prototype prototype = new Prototype();
        // Create a new instance of the prototype
        Prototype clone = prototype.clone();
        // Check if the prototype and the clone are the same
        System.out.println(prototype == clone);
    }

    // Create a clone of the prototype
    public Prototype clone() {
        return new Prototype();
    }
}
