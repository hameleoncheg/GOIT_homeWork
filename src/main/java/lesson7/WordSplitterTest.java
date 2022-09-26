package lesson7;

import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter {
    public String[] split(String phrase){

        String asd = phrase.toLowerCase().replaceAll("\\s+", " ");
        String[] ras = asd.split(" ");


        return ras;
    }
}