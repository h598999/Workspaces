package Coding_with_john;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		Transcript transcript  = new Transcript();
		transcript.setAudio_url("https://bit.ly/3yxKEIY");
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(transcript);
		HttpRequest postRequest = HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", "4ed83ac7f7404909933f22425669fae9")
				.POST(BodyPublishers.ofString(jsonRequest)).build();
		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
		
		System.out.println(postResponse.body());
		
		transcript = gson.fromJson(postResponse.body(), Transcript.class);
	
		
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
				.header("Authorization", "4ed83ac7f7404909933f22425669fae9")
				.build();
		HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		while(true) {
		getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		transcript = gson.fromJson(getResponse.body(), Transcript.class);
		
		System.out.println(transcript.getStatus());
		
		if ("completed".equals(transcript.getStatus())||"error".equals(transcript.getStatus()))
			break;
		Thread.sleep(1000);
		}
		System.out.println(getResponse.body());
		System.out.println("Transcription complete");
		System.out.println(transcript.getText());
		System.out.println(transcript.getId());
		System.out.println(transcript.getStatus());
		
	}

}