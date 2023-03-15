package examples.Stream;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamParser {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter out even numbers
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("Filtered numbers: " + filteredNumbers);

        // Double each number
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled numbers: " + doubledNumbers);

        // Compute the sum of the numbers
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
