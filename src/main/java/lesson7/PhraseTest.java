package lesson7;

import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
class Phrase {
    private  String[] words;
    private String[] words2;

    public Phrase( String[] words) {
        this.words = words;
        this.words2 = Arrays.copyOf(words,words.length);

    }

    @Override
    public String toString() {
        String result = "";
        for(String word : words2){
            result += word + " ";
        }
      //  return words[0] + " " + words[1] + " " + words[2];
        return result;
    }
}