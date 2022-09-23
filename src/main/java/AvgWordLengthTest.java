import java.lang.reflect.Array;
import java.util.Arrays;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength{
    public double count(String phrase){
        String[] b = phrase.split(" ");
        double sum = 0;
        for (int i = 0; i <b.length ; i++) {
            sum+= b[i].length();
        }
        double fin = sum / b.length;
        return fin;
    }
}