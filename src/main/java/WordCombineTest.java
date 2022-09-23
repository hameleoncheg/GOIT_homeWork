import java.util.Arrays;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){

        String[] a =sourceWord.toLowerCase().split("");
        String[] b =targetWord.toLowerCase().split("");
       // System.out.println(Arrays.toString(a));
        boolean as = true;
        int count = 0;
        for (String word:a){
            if(word.equals(b[count])){
                as = true;
                count++;
                break;
            } else{
                as = false;
            }
        }
        return as;
    }
}