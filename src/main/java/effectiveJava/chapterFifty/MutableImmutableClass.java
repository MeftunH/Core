package main.java.effectiveJava.chapterFifty;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.Date;

public class MutableImmutableClass {
    public static void main(String[] args) {
        //Immutable
        String name="Meftun";
        System.out.println(name.toUpperCase());
        System.out.println(name);

        //Mutable
        Date date=new Date();
        System.out.println(date);
        date.setYear(2025);
        System.out.println(date);
    }
}
