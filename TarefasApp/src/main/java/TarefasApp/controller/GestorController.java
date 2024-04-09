package TarefasApp.controller;

import com.google.gson.Gson;

import TarefasApp.model.domain.Funcionario;
import TarefasApp.model.domain.Gestor;
import TarefasApp.model.service.FuncionarioService;
import TarefasApp.model.service.GestorService;
import spark.Route;

public class GestorController {
	public static Route obterLista = (req,res) -> {
		return GestorService.obterLista() ;
		
		
	};
	public static Route incluir = (req,res) -> {
		Gestor gestor = new Gson().fromJson(req.body(), Gestor.class);
		GestorService.incluir(gestor);
		return "Inclusão: " + gestor;
	};
	public static Route excluir = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		
		Gestor gestor =GestorService.obterPorId(index);
		GestorService.excluir(index);
		return " excluído: " + gestor;
	};
	public static Route recuperar = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Gestor gestor =GestorService.obterPorId(index);
		return "Detalhamento : " + gestor;
	};
	
}
