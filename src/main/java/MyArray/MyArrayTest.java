package MyArray;

import java.util.ArrayList;
import java.util.List;

public class MyArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("old");
        list2.add("old");
        list2.add("old");
        list2.add("old");
        list2.add("old");
        list2.add("old");
        System.out.println(list2.get(2));
        list2.add(2,"new");
        System.out.println(list2.get(2));



    }
}
