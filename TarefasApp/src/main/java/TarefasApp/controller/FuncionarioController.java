package TarefasApp.controller;

import com.google.gson.Gson;

import TarefasApp.model.domain.Funcionario;
import TarefasApp.model.service.FuncionarioService;
import spark.Route;

public class FuncionarioController  {

	public static Route obterLista = (req,res) -> {
		return FuncionarioService.obterLista() ;
		
		
	};
	public static Route incluir = (req,res) -> {
		Funcionario func = new Gson().fromJson(req.body(), Funcionario.class);
		FuncionarioService.incluir(func);
		return "Inclusão: " + func;
	};
	public static Route excluir = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		
		Funcionario func =FuncionarioService.obterPorId(index);
		FuncionarioService.excluir(index);
		return "Funcionario excluído: " + func;
	};
	public static Route recuperar = (req,res) -> {
		Integer index = Integer.valueOf(req.params("id"));
		Funcionario func =FuncionarioService.obterPorId(index);
		return "Detalhamento funcionário : " + func;
	};
	

	

}
