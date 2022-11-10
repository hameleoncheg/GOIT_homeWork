package lesson13;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Task2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1/posts"))
                .GET()
                .header("Content-Type","application/json")
                .build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        final User[] users = new Gson().fromJson(response.body(), User[].class);

        int userId = 0;
        int postId = 0;
        for (User user : users) {
            if (user.getId() > postId) {
                postId = user.getId();
                userId = user.getUserId();
            }
        }
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/" + postId +"/comments"))
                .GET()
                .header("Content-Type","application/json")
                .build();
        final HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());

        String path = "user-" + userId + "-post-" + postId + "-comments.json";
        File file = new File("/Users/hameleoncheg/Documents/" + path);
        try (FileWriter writer = new FileWriter(file))
        {
            writer.write(response2.body());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}