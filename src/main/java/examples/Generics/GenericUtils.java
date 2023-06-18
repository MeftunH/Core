package main.java.examples.Generics;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.ArrayList;
import java.util.List;

public class GenericUtils {
    public static <T extends Number> double sum(List<T> list) {
        double total = 0.0;
        for (T element : list) {
            total += element.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(GenericUtils.sum(intList));
    }
}