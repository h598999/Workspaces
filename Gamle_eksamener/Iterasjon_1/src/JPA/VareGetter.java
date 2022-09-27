package JPA;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import Entiteter.Vare;


public class VareGetter {

	public static Vare getVare(int id) throws IOException, InterruptedException {
		Transcript transcript = new Transcript();
		transcript.setId(id);
		HttpClient httpClient = HttpClient.newHttpClient();
		Gson gson = new Gson();
		
		try {
			HttpRequest getRequest = HttpRequest.newBuilder()
					.uri(new URI("https://www.foodrepo.org/api/v3/products/" + transcript.getId()))
					.header("Authorization", "Token token=536f731144fa1ba705ebe3338271ba5f")
					.build();
			HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
			JsonObject convertedObject = gson.fromJson(getResponse.body(), JsonObject.class).get("data").getAsJsonObject();
			while (true) {
				 getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
				convertedObject = gson.fromJson(getResponse.body(), JsonObject.class).get("data").getAsJsonObject();
				transcript = gson.fromJson(convertedObject, Transcript.class);
				System.out.println(transcript.getStatus());
				if (transcript.getStatus().equals("complete"))
					break;
				Thread.sleep(1000);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		Vare vare = new Vare();
		vare.setId(transcript.getId());
		vare.setBarcode(transcript.getBarcode());
		return vare;
	}
	
	
	
}
