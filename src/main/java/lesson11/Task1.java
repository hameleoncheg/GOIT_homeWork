package lesson11;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String nameSorted(List<String> names){

        String[] names2 = names.toArray(new String[0]);

        List<String> resultList = IntStream.range(0, names2.length)
                .filter(index -> index % 2 == 0)
                .mapToObj(i -> names2[i])
                .collect(Collectors.toList());

        return resultList.toString();
    }
}