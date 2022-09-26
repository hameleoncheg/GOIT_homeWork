package lesson7;

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] b = phrase.split(" ");
        int cou = 0;
        for(String a: b){
            if(a.length() <= minLength){
                cou++;
            }
        }
       // System.out.println(b[1].length());
        return cou;
    }
}