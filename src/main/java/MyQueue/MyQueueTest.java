package MyQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueueTest {
    public static void main(String[] args) throws Exception {
        MyQueue queue1 = new MyQueue();
        queue1.add("Первый");
        queue1.add("Второй");
        queue1.add("Третий");
        queue1.add("4");
        queue1.add("5");

        System.out.println(queue1);

    }
}
