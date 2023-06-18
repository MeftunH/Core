package main.java.examples.Generics;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public interface GenericCollectionInterface<T> {
    void add(T element);

    T get(int index);

    int size();
}
