package lesson7;

class PhraseMaker {
    public String join(String[] words) {
       StringBuilder a = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            a.append(word);

            if (i != words.length - 1) {
                a.append(" ");

            }
        }
        String s = String.valueOf(a);
        return s;
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}