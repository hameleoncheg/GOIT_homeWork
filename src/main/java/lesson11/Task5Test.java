package lesson11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5Test {
    public static <T> void main(String[] args) {
        Stream<T> streamFirst = (Stream<T>) Stream.of("Ivan","Alex","Nikolay");
        Stream<T> streamSecond = (Stream<T>) Stream.of(10, 20, 30);
         Task5.zip(streamFirst, streamSecond)
                 .peek(System.out::println)
                .collect(Collectors.toList());
    }
}