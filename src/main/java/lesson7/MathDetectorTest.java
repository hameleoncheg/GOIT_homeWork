package lesson7;

import java.util.Arrays;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
class MathDetector {
    public boolean isMath(String text){
        String[] b = text.split("");
        System.out.println(Arrays.toString(b));
        int cont = 0;
        boolean rav = false;
        boolean sim = false;
        for(String word: b){
            if(word.equals("=")){
                rav = true;
            }
            if(word.equals("+") && word.equals("+") && word.equals("-") && word.equals("*") && word.equals("/")){
                sim = true;
            }
            if(word.equals("1") |
                    word.equals("2")
                    | word.equals("3")
                    | word.equals("4")
                    | word.equals("5")
                    | word.equals("6")
                    | word.equals("7")
                    | word.equals("8")
                    | word.equals("9")
                    | word.equals("0")
            ) {
                cont++;
            }
        }
        boolean num = cont >=2;
        boolean result = sim || num;
        return result;

    }
}