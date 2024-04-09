package TarefasApp.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import spark.Request;
import spark.Response;
import spark.Route;


import spark.Route;

public class ProdutosIBGEController {
	public static Route produtosIBGE = (Request req, Response res)->{
		String url = "https://servicodados.ibge.gov.br/api/v1/produtos/estatisticas";
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		if (responseCode ==HttpURLConnection.HTTP_OK) {
			BufferedReader reader = new BufferedReader (new InputStreamReader(connection.getInputStream()));
			StringBuilder responseBuilder = new StringBuilder();
			String line;
	while((line = reader.readLine())!= null) {
		responseBuilder.append(line);
	}
	reader.close();
		return responseBuilder.toString();
		}else {
			return "erro";
		}
	};

}
