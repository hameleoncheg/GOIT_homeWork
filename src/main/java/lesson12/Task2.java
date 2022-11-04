package lesson12;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        new Thread() {
            public void run() {
                try {
                    fizzBuzz.fizz(() -> System.out.println("fizz; "));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    fizzBuzz.buzz(() -> System.out.println("buzz; "));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    fizzBuzz.fizzbuzz(() -> System.out.println("fizzbuzz; "));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    fizzBuzz.number(x -> System.out.println(x + "; "));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


}
