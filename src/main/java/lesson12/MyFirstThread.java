package lesson12;

import java.time.LocalTime;


public class MyFirstThread extends Thread {

    public void run(){
        int i = 1;
        while (true){
            LocalTime start = LocalTime.of(0, 0, 0);
            LocalTime counter = start.plusSeconds(i);
            System.out.println(Thread.currentThread().getName() + " Время с начала запуска: " +  counter );
            i++;
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
