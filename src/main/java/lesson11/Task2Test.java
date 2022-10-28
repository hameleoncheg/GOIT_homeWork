package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Task2Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petro");
        names.add("Oleksiy");
        names.add("Anatoliy");
        names.add("Mykhaylo");
        System.out.println(Task2.upperCaseAndSorted(names));
    }
}
