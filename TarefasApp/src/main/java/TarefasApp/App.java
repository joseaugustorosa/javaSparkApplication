package TarefasApp;

import TarefasApp.controller.FuncionarioController;
import TarefasApp.controller.GestorController;
import TarefasApp.controller.ProdutosIBGEController;
import TarefasApp.controller.TarefaController;
import TarefasApp.controller.UsuarioController;
import spark.Spark;

public class App {
	//usuario, funcionario, tarefa, adm
	public static void main(String[] args) {
		Spark.port(7777);
		Spark.get("/", (req,res) ->{return App.class.getResourceAsStream("/index.html");});
		
		//User
		Spark.get("/usuario", new UsuarioController());
		//Func
		
		Spark.get("/funcionario/lista",FuncionarioController.obterLista);
		Spark.post("/funcionario/incluir",FuncionarioController.incluir);
		Spark.delete("/funcionario/:id/excluir",FuncionarioController.excluir);
		Spark.get("/funcionario/:id",FuncionarioController.recuperar);
		
		//tarefa
		
		Spark.get("/gestor/lista",TarefaController.obterLista);
		Spark.post("/tarefa/incluir",TarefaController.incluir);
		Spark.delete("/tarefa/:id/excluir",TarefaController.excluir);
		Spark.get("/tarefa/:id",TarefaController.recuperar);
		//gestor
		
		Spark.get("/gestor/lista",GestorController.obterLista);
		Spark.post("/gestor/incluir",GestorController.incluir);
		Spark.delete("/gestor/:id/excluir",GestorController.excluir);
		Spark.get("/gestor/:id",GestorController.recuperar);
		
		
		Spark.get("/consulta/produtoIBGE",ProdutosIBGEController.produtosIBGE);
		
	}
}
