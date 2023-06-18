package main.java.examples.Stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {

    }

    //GET ARRAY'S ELEMENTS => stream()
    //FILTER NAMES LONGER THAN 5 => filter()
    //GET NUMBER OF THE OTHER LETTERS FROM LIST => mapToInt
    //SUM OF LETTERS => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .parallel()
                .filter(name -> name.length() > 5) //examples.Stream<examples.String>
                .mapToInt(String::length) //examples.Stream>Integer>
                .sum()
                ;
    }
}
