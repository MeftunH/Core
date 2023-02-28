package examples.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixToString {
    public static void main(String[] args) {
        AddPrefixToString.getString(Arrays.asList(3,44)); //isEqualTo("o3,e44")
        AddPrefixToString.getString(Collections.singletonList(3));//isEqualTo("o3")
    }
    //add o to odd and e to double numbers
    private static String getString(List<Integer> asList) {
        return asList.stream()
                .map(i->{
                    String s = "";
                    if (i%2 == 0){
                        s+="e" + i;
                    }
                    else {
                        s += "o" + i;
                    }
                    return s;
                })   //examples.Stream<examples.String>
                .collect(Collectors.joining(","))
                ;
    }
}
