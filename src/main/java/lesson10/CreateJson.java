package lesson10;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;


class CreateJson {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/hameleoncheg/Documents/file2.txt";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(ReaderTxtFile.myFileReader(fileName));
        WriteJson.writeFile(json);

    }



}




