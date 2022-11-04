package qwert;


public class NovyiZavet {
    public static void main(String[] args) {

        church(1550);
    }
    public static void church(int sum) {

        String indulgence = " У Вас тепер індульгенція";

        if(sum == 100){
            System.out.println(indulgence + ", але прочитай Отче Наш!!!");
        }
        else if(sum > 100){
            System.out.println(indulgence);
        } else {
            System.out.println("Гори в аду");
        }

    }
}
