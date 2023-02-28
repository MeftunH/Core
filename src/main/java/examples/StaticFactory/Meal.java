package examples.StaticFactory;

public class Meal {
    String name;


    public Meal(String name) {
        this.name = name;
    }
    public static IceCream coldMeal(String name) {
        return new IceCream();
    }
}
