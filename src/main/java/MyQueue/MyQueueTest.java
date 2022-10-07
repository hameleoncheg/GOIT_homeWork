package MyQueue;


public class MyQueueTest {
    public static void main(String[] args) throws Exception {
        MyQueue Queue = new MyQueue();
        Queue.add("Первый");
        Queue.add("Второй");
        Queue.add("Третий");
        Queue.add("4");
        Queue.add("5");

        System.out.println(Queue);
        Queue.remove(3);
        System.out.println(Queue);

    }
}
