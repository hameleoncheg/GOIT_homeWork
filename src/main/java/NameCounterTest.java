import java.util.Arrays;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter {
    public int count(String text){
        int count = 0;
        String[] b = text.split(" ");
        for (int i = 0; i < b.length; i++) {
            if(b[i].length() < 2 || !(Character.isUpperCase(b[i].charAt(0))) ){
                b[i] = "";
            } else{
                count++;
            }
        }
        String remove = String.join(" ", b).replaceAll("\\s+"," ").trim();
        String[] c = remove.split(" ");
        //  System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            int cou = i;
            if(Character.isUpperCase(c[cou].charAt(1)) ){
                c[cou] = "";
            }
        }
        System.out.println(Arrays.toString(c));
        //   System.out.println(count);

        return count;
    }
}

//Character.isUpperCase
