package MyArray;

import java.util.ArrayList;
import java.util.List;

public class MyArrayTest {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        MyArrayList<String> List2 = new MyArrayList<>();
        List2.add("1");
        List2.add("2");
        List2.add("3");
        List2.add("4");
        List2.add("5");
        List2.add("6");
        System.out.println(List2.get(2));
        System.out.println("_______");
        List2.add(2,"new");
        System.out.println(List2.get(0));
        System.out.println(List2.get(1));
        System.out.println(List2.get(2));
        System.out.println(List2.get(3));
        System.out.println(List2.get(4));
        System.out.println(List2.get(5));
        System.out.println(List2.get(6));

     //List2.clear();
      //  System.out.println(List.get(2));
      //  List2.add( 3,"dsdsd");
       System.out.println(List2.size());
      //  System.out.println(List2.size());
    }
}
