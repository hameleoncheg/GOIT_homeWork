import java.util.Arrays;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
class WaterCounter {
    public double count(String text){
        double dlinna = text.length();
        String[] b = text.split(" ");
        double prob = text.length() - text.replaceAll(" ", "").length();
   //   System.out.println(dlinna);
   //   System.out.println(prob);
        return prob/dlinna;
    }
}