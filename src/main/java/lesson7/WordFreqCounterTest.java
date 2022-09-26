package lesson7;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String a = phrase.toLowerCase();
        String c = word.toLowerCase();
        String[] b = a.split(" ");
        float count = 0;
        //System.out.println(Arrays.toString(b));
        for(String word2: b){
            if(word2.equals(c)){
                count++;
            }
        }
        final float v = count / b.length;
      //  System.out.println(phrase.length());
        return v;
    }
}