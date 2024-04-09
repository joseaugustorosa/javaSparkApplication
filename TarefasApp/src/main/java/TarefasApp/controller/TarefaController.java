package TarefasApp.controller;

import com.google.gson.Gson;

import TarefasApp.model.domain.Funcionario;
import TarefasApp.model.domain.Tarefa;
import TarefasApp.model.service.TarefaService;
import spark.Route;

public class TarefaController {

	public static Route obterLista = (req,res) -> {
		return TarefaService.obterLista() ;
		
		
	};
	public static Route incluir = (req,res) -> {
		Tarefa task = new Gson().fromJson(req.body(), Tarefa.class);
		TarefaService.incluir(task);
		return "Inclusão: " + task;
	};
	public static Route excluir = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		
		Tarefa task =TarefaService.obterPorId(index);
		TarefaService.excluir(index);
		return "Funcionario excluído: " + task;
	};
	public static Route recuperar = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Tarefa func =TarefaService.obterPorId(index);
		return "Detalhamento funcionário : " + func;
	};
	
}
