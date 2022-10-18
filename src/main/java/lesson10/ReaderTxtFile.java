package lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReaderTxtFile {
    static List<User>  myFileReader(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader((fileName)));
        String headerLine = br.readLine();
        String line;
        List<User> list = new LinkedList<>();
        String[] arr = new String[2];
        int i = 0;
        while((line = br.readLine()) != null){
            arr = line.split(" ");
            User user = new User(arr[0], Integer.parseInt(arr[1]));
            list.add(user);
            i++;
        }
        br.close();
        return list;

    }
}
