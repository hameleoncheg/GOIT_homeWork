package lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CountWords {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/hameleoncheg/Documents/word.txt";
        myFileReader(fileName);
    }
    private static void myFileReader(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader((fileName)));
        String line;
        List<String> list = new LinkedList<String>();
        int i = 0;
        while((line = br.readLine()) != null){
                list.add(line);
                i++;
        }
        System.out.println(countWords(list));
        br.close();
    }
    public static String countWords(List<String> lines) {
        StringBuilder res = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : lines) {
            String[] arr = s.split(" ");
            for (String i : arr) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.append(entry);
            res.append("\n");
        }
        return res.toString();
    }

}
