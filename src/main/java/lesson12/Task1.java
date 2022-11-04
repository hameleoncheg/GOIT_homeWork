package lesson12;

public class Task1 {
    public static void main(String[] args) {

        Thread thread1 = new MyFirstThread();
        Thread thread2 = new MySecondThread();

            thread1.start();
            thread2.start();

    }
}
