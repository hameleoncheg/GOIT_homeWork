package lesson7;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
class WordDeleter {
    public String remove(String phrase, String[] words){
        String[] b = phrase.split(" ");

      //  System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(b[i].equals(words[j])){
                    b[i]="";
                }
            }
        }
       // System.out.println(Arrays.toString(b));

     // String arrayToString = String.join(" ", b).replaceAll("\\s"," ").trim();
      String arrayToString =String.join(" ", b).replaceAll("\\s+"," ").trim();


        return  arrayToString;
    }
}

