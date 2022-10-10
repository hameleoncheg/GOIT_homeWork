package MyLinked;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("1");
        list.add("второй");
        list.add("третий");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(2) = " + list.get(2));
        list.remove(2);
        System.out.println("list.size() = " + list.size());
    }

}
