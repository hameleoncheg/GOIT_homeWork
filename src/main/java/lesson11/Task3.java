package lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> intSorted(String[] values){

        return Arrays.stream(values)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.toList());


    }
}