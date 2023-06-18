package main.java.effectiveJava.chapterFifty;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end=new Date();
        String parameter="Parameter";
        Period p = new Period(start,end, parameter);
        //it changes first date too.We expected that it will change only end date cause of date is mutable
        //We can fix this problem by returning new Date object
        //We cant handle this by class immutability because date is mutable
        end.setYear(78);
        System.out.println(p);


        start=new Date();
        end=new Date();

        p=new Period(start,end, parameter);
        p.getEnd().setYear(2023);
        System.out.println(p);
    }
}
