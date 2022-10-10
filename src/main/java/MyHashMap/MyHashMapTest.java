package MyHashMap;

import java.util.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
        map.put("Первый", 1);
        map.put("Второй", 2);
        map.put("Третий", 3);
        System.out.println(map.size());
        System.out.println("map.get(\"Первый\") = " + map.get("Первый"));
        map.remove("Первый");
        System.out.println("map.get(\"Первый\") = " + map.get("Первый"));

    }
}
