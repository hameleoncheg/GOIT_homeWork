package MyArray;

import java.util.ArrayList;
import java.util.List;

public class MyArrayTest {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        MyArrayList<String> List2 = new MyArrayList<>();
        List2.add("old");
        List2.add("old");
        List2.add("old");
        List2.add("old");
        System.out.println(List2.get(2));
        List2.add(2,"new");
        System.out.println(List2.get(2));



    }
}
