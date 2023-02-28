package examples.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap
{
    public static void main(String[] args) {

    }

    //get Nested List elements => stream()
    //add to list each element => flatMap()
    public static List<String> transformStream(List<List<String>> collection)
    {
        return collection.stream()
                .flatMap(Collection::stream)   //examples.Stream<examples.Stream<examples.String>> => examples.Stream<examples.String>
                .collect(Collectors.toList())
                ;
    }

    public static List<String> transform(List<List<String>> collection)
    {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection:collection){
            for (String value : subCollection)
            {
                newCollection.add(value);
            }
        }
        return newCollection;
    }


}
