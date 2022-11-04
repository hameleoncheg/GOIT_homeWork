package lesson12;

public class MySecondThread extends Thread {
    public void run(){

        while (true){

            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " Прошло 5 секунд");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
