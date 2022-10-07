package MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack MyStack = new MyStack();
        MyStack.push("Первый");
        MyStack.push("2");
        MyStack.push("Третий");
        MyStack.push("4");
        MyStack.push("Пятый");

        System.out.println(MyStack);
        MyStack.remove(2);
    }
}
