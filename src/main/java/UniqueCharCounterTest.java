import java.lang.reflect.Array;
import java.util.Arrays;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab1a0"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter {
    public int count(String phrase){
        char[] charArray = phrase.toCharArray();
        int result = 0;
        int countUnique = 0;
        int count = 0;
      //  System.out.println(Arrays.toString(charArray));
        for (int i = 0; i < charArray.length; i++){
            countUnique++;
            for (int j = i+1; j < charArray.length; j++)
            {
                if (charArray[j] == charArray[i])
                {
                    count++;
                    break;
                }
            }
        }

        return result = countUnique - count;
    }
}