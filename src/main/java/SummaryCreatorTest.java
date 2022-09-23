    import javax.sound.midi.Soundbank;
    import java.util.Arrays;
    import java.util.SortedMap;

    class SummaryCreatorTest {
        public static void main(String[] args) {
            SummaryCreator summaryCreator = new SummaryCreator();

            //Mars
            String shortPhrase = "hyvegydoygpiybx zo";
            System.out.println(summaryCreator.create(shortPhrase));

            //Java is very po...
            String longPhrase = "Java is very popular language";
            System.out.println(summaryCreator.create(longPhrase));
        }
    }
    class SummaryCreator {
        public String create(String text){
            String[] b = text.split("");
            int s = b.length;
           // System.out.println(b[16]);
            if(s <= 15){
                return text;
            }
          //  String d;

            if( s > 16 && b[15].equals(" ")){
                StringBuilder result = new StringBuilder(text.substring(0, 15));
                String f = String.valueOf(result);

                return f;
               // System.out.println(result);
            }
           // System.out.println(s);
            if( s >= 16 ){
                StringBuilder result2 = new StringBuilder(text.substring(0, 15) + "...");
                String f2 = String.valueOf(result2);
                return f2;
                // System.out.println(result);
            }
            return text;
        }
    }