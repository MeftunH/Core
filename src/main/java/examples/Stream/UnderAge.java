package examples.Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNamesByStream(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge()>18) //examples.Stream<Person>
                .map(Person::getName) //examples.Stream<examples.String> = > "jack","john,jack"
                .collect(Collectors.toSet());  //"jack,john"
    }

}
