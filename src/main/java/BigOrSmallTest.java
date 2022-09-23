import java.util.Arrays;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text){
        int small = 0;
        int big = 0;
        char[] ch = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ch[i] = text.charAt(i);
        }
        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i]) == true){
                big++;
            } else{
                small++;
            }
        }
        if(small>big){
            return "Small";
        }
        if(big>small){
            return "Big";
        }
        return "Same";
    }
}