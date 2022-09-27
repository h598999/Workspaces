package APITest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main2 {

	public static void main(String[] args) {
		//Method 2 uses java.net.http.HttpClient
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).
		thenApply(Main2::parse).join();
	}
	
	public static String parse(String responseBody) {
		JSONArray albums = new JSONArray(responseBody);
		for (int i = 0; i<albums.length(); i++) {
			JSONObject album = albums.getJSONObject(i);
			int id = album.getInt("id");
			int userId = album.getInt("userId");
			String title = album.getString("title");
			System.out.println(id + " " + userId + " " + title);
		}
		return null;
	}
	
}
