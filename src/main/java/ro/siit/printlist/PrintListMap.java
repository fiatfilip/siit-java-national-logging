package ro.siit.printlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintListMap {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Bruce Willis", 55));
        persons.add(new Person("Samantha Catch", 60));

        String names = persons.stream()
            .map(Person::getName)
//          .reduce("", (e, f) -> e.concat(", ").concat(f)); // dar aici trebuie facut apoi substring
// sau folosim
            .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
