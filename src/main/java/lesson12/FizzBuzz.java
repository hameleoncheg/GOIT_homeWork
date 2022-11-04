package lesson12;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.IntConsumer;

public class FizzBuzz {

    private final int n;

    private final BlockingQueue<Integer> queueFizz = new LinkedBlockingQueue<>();
    private final BlockingQueue<Integer> queueBuzz = new LinkedBlockingQueue<>();
    private final BlockingQueue<Integer> queueFizzBuzz = new LinkedBlockingQueue<>();
    private final BlockingQueue<Integer> queueNumber = new LinkedBlockingQueue<>();

    public FizzBuzz(int n) throws InterruptedException {
        this.n = n;
        queueNumber.put(1);
    }

    private void decineNextQueue(int i) throws InterruptedException {
        if (i > this.n) {
            queueFizz.put(0);
            queueBuzz.put(0);
            queueFizzBuzz.put(0);
            queueNumber.put(0);
            return;
        }
        if (i % 15 == 0) {
            queueFizzBuzz.put(i);
        } else if (i % 3 == 0) {
            queueFizz.put(i);
        } else if (i % 5 == 0) {
            queueBuzz.put(i);
        } else {
            queueNumber.put(i);
        }
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        for (;;) {
            Integer output = this.queueFizz.take();

            if (output.intValue() == 0) {
                return;
            }

            printFizz.run();
            decineNextQueue(output + 1);
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (;;) {
            Integer output = this.queueBuzz.take();

            if (output.intValue() == 0) {
                return;
            }

            printBuzz.run();
            decineNextQueue(output + 1);
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (;;) {
            Integer output = this.queueFizzBuzz.take();

            if (output.intValue() == 0) {
                return;
            }

            printFizzBuzz.run();
            decineNextQueue(output + 1);
        }
    }

    public void number(IntConsumer printFunc) throws InterruptedException {
        for (;;) {
            Integer output = this.queueNumber.take();

            if (output.intValue() == 0) {
                return;
            }

            printFunc.accept(output);
            decineNextQueue(output + 1);
        }
    }

}

