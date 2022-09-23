import java.util.Arrays;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
class PalindromeCounter{
    public int count(String phrase){
        int count = 0;
        String [] words = phrase.toLowerCase().split("\\s+");
        for(String i: words){
            if (i == null){
                return 0;
            }
            StringBuilder strBuilder = new StringBuilder(i);
            strBuilder.reverse();
            if (strBuilder.toString().equals(i)){
                count++;
            }

        }
        return count;
    }
}