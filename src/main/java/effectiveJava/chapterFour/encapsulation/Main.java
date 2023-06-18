package main.java.effectiveJava.chapterFour.encapsulation;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class Main {
    public static void main(String[] args) {
        Data data=new Data("Maftun", 25);
        System.out.println(data);
        data.setValue(26);
        System.out.println(data);
    }
}
