package lesson11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Test {
    public static void main(String[] args) {
        Task4 random = new Task4(25214903917L, 11, (int) Math.pow(2, 48));
        Stream<Long> integerStream = Stream.iterate(20L, (seed) -> random.seed(seed).next());
        integerStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
