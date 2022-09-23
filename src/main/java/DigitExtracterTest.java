import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
class DigitExtracter{
    public int[] extract(String text){
        String[] b = text.split("");
       // System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            if(!(b[i].equals("1"))
                    && !(b[i].equals("2"))
                    && !(b[i].equals("3"))
                    && !(b[i].equals("4"))
                    && !(b[i].equals("5"))
                    && !(b[i].equals("6"))
                    && !(b[i].equals("7"))
                    && !(b[i].equals("8"))
                    && !(b[i].equals("9"))
                    && !(b[i].equals("0"))
            ){
                b[i] = "" ;
            }
        }
        String arrayToString =String.join("", b).replaceAll("\\s+"," ").trim();
     //   System.out.println(arrayToString);
        String [] qqq = arrayToString.split("");
      //  System.out.println(Arrays.toString(qqq));
     //  int[] arrTarget = Arrays.copyOf(arrayToString, arrayToString.length());
        int[] fin = new int[qqq.length];
        for (int i = 0; i < qqq.length; i++) {
            fin[i] = Integer.parseInt(qqq[i]);
        }
        return fin ;
    }
}
//     int i=Integer.parseInt("200");