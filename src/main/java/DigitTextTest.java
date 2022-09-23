import java.util.Arrays;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText {
    public boolean detect(String text){
        String[] b = text.split("");
        String[] c = {"1","2","3","4","5","6","7","8","9","0"};
      //  System.out.println(Arrays.toString(b));
        for (int i = 0; i <b.length ; i++) {
            if(b[i].equals("1") |
                    b[i].equals("2")
                    | b[i].equals("3")
                    | b[i].equals("4")
                    | b[i].equals("5")
                    | b[i].equals("6")
                    | b[i].equals("7")
                    | b[i].equals("8")
                    | b[i].equals("9")
                    | b[i].equals("0")
                    | b[i].equals(" ")
            ) {
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
}