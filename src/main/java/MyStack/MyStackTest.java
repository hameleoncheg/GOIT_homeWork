package MyStack;

import javax.sound.midi.Soundbank;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack Stack = new MyStack();
        Stack.push("Первый");
        Stack.push("2");
        Stack.push("Третий");
        Stack.push("4");
        Stack.push("Пятый");

        System.out.println(Stack);
        System.out.println(Stack.peek());
        System.out.println(Stack);
    }
}
