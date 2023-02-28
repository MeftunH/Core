package effectiveJava.chapterOne.itemOne;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import examples.StaticFactory.IceCream;

public class Food {
    String name;

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public static Food coldFood(String name){
        return new Puding();
    }
    public static Food hotFood(String name){
        return new Hamburger();
    }
}
