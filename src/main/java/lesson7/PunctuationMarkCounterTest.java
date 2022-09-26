package lesson7;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
class PunctuationMarkCounter {
    public int count(String phrase){
        int count2 = phrase.length();
        int count3 = 0;
        for (int i = 0; i < count2; i++) {
            if(phrase.charAt(i) == '.' || phrase.charAt(i) == ',' || phrase.charAt(i) == '!' || phrase.charAt(i) == ':' || phrase.charAt(i) == ';' ){
                count3++;
            }
        }
        return count3;
    }
}