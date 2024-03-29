package main.java.examples.Stream;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
    @Override
    public int compareTo(Person o) {
        return this.age > o.age ? 1 : 0;
    }
}
