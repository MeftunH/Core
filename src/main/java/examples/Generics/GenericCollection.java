package examples.Generics;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.ArrayList;
import java.util.List;

public class GenericCollection<T> implements GenericCollectionInterface<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        GenericCollection<String> stringList = new GenericCollection<String>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList.size());

    }
}
