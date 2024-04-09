package TarefasApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import TarefasApp.model.domain.Tarefa;

public class TarefaService {
private static Map<Integer, Tarefa> tarefas = new HashMap<Integer, Tarefa>();	
	
	private static Integer id = 0;
	public static void incluir(Tarefa tarefa) {
		tarefa.setId(id++);
		tarefas.put(tarefa.getId() ,tarefa);
	}
	public static void excluir( Integer id) {
		tarefas.remove(id);
	}
	public static Collection<Tarefa> obterLista( ) {
		return tarefas.values();
	}
	public static Tarefa obterPorId( Integer id) {
		return tarefas.get(id);
	}
}
