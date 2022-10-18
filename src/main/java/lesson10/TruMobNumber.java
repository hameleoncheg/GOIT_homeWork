package lesson10;
import java.io.*;

public class TruMobNumber {
    public static void main(String[] args) throws IOException {

        String fileName = "/Users/hameleoncheg/Documents/file.txt";
        myFileReader(fileName);

        }
    private static void myFileReader(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader((fileName)));
        String line;
        while((line = br.readLine()) != null){

            if (line.matches("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[-.]?\\d{4}$") == true){
                System.out.println(line);
            }
        }
        br.close();
    }
}
