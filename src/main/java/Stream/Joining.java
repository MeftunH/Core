package Stream;

import java.util.List;

public class Joining {
    public static String namesToString(List<Person> people) {
        String label="Names: ";
        StringBuilder sb=new StringBuilder(label);
        for (Person person : people) {
            if (sb.length()>label.length()) {
                sb.append(person.getName());
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToStringByStream(List<Person> people) {
        return new StringBuilder("Names: ").append(people
                .stream()
                .map(Person::getName)
                .reduce((i, sum)->i+" ,"+sum).orElse("")).append(".").toString();
    }
}
