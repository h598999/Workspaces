package APITest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;



public class MainFood2 {

	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
		
		Transcript transcript = new Transcript();
		transcript.setId("2030");
		Gson gson = new Gson();
		String JsonRequest = gson.toJson(transcript);
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI("https://www.foodrepo.org/api/v3/products/" + transcript.getId()))
				.header("Authorization", "Token token=536f731144fa1ba705ebe3338271ba5f")
				.GET()
				.build();
		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		
		
		System.out.println(getResponse.body());
		
		transcript = gson.fromJson(getResponse.body(), Transcript.class);
		
		System.out.println(transcript.getId());
		
}
}
