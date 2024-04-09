package TarefasApp.controller;

import TarefasApp.model.domain.Usuario;
import spark.Request;
import spark.Response;
import spark.Route;

public class UsuarioController implements Route{

	@Override
	public String handle(Request request, Response response) throws Exception {
		StringBuilder html = new StringBuilder();
		
		
		
		
		 
		
      
		html.append(new Usuario());
		html.append("<br><p><a href=\"/\">Home</a></p>");
		
		return html.toString();
	}
	

}
