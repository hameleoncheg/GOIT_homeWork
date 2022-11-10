package lesson13;


import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Task3 {
    public static <T> void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1/todos"))
                .GET()
                .header("Content-Type","application/json")
                .build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        final Todo[] todos = new Gson().fromJson(response.body(), Todo[].class);
        ArrayList<Todo> listTodo = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getCompleted().equals("false")) {
                listTodo .add(todo);
            }
        }
        String sortedTodo= new Gson().toJson(listTodo);
        System.out.println(sortedTodo);


    }
}
