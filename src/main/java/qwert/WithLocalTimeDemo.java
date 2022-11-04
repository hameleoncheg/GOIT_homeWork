package qwert;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class WithLocalTimeDemo {
    public static void main(String[] args) {
        LocalTime noon = LocalTime.of(0, 0, 0);

        LocalTime ten = noon.with(ChronoField.HOUR_OF_DAY, 10);
        LocalTime eight = noon.withSecond(8);
        LocalTime twelveThirty = noon.withMinute(30);
        LocalTime thirtyTwoSeconds = noon.withSecond(32);


        // Можно использовать сцепление методов
        LocalTime secondsNano = noon.withSecond(20).withNano(999999);

        System.out.println(noon);
        System.out.println("eight: " + eight);
        System.out.println("twelveThirty: " + twelveThirty);
        System.out.println("thirtyTwoSeconds: " + thirtyTwoSeconds);
        System.out.println("secondsNano: " + secondsNano);
    }
}