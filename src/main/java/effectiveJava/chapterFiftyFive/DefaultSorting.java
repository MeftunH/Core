package main.java.main.java.effectiveJava.chapterFiftyFive;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.Arrays;

public class DefaultSorting {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "Dave", "Eve" };

// Sort the names array in ascending order
        Arrays.sort(names);

// Print the sorted names
        for (String name : names) {
            System.out.println(name);
        }
    }
}
