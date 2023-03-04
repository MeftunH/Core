package effectiveJava.chapterOne.itemSeven;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    public Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;

    public Stack()
    {
        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e)
    {
        ensureCapacity();
        elements[size++]=e;
    }
    public Object pop()
    {
        if(size==0)
            throw new EmptyStackException();
        return elements[--size];
    }
    private void ensureCapacity()
    {
        if(elements.length==size)
            elements=Arrays.copyOf(elements,2*size+1);
    }
    public Object popWell() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
}