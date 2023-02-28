package examples.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

    //get all utens => stream()'
    //change to uppercase => map()
    //return as list => collect()
    public static void main(String[] args) {
      mapToUpperCase("a","b","ced");
    }

    public static Collection<String> mapToUpperCase(String ...names){
      return Arrays.stream(names).map(
                String::toUpperCase
        ).collect(Collectors.toList());
    }

}
