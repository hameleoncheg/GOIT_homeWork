package lesson11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static List<String> upperCaseAndSorted(List<String> names){

        return  names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());



    }
}
