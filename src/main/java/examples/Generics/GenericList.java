package examples.Generics;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public static void main(String[] args) {
        GenericList<String> stringList = new GenericList<String>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
    }
}

