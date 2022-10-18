package lesson10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {
    public static void writeFile(String json) throws IOException {
        File file = new File("/Users/hameleoncheg/Documents/user.json");
        try (FileWriter writer = new FileWriter(file))
        {
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
