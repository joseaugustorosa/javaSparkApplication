package TarefasApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import TarefasApp.model.domain.Gestor;

public class GestorService {
private static Map<Integer, Gestor> gestores = new HashMap<Integer, Gestor>();	
	
	private static Integer id = 0;
	public static void incluir(Gestor gestor) {
		gestor.setId(id++);
		gestores.put(gestor.getId() ,gestor);
	}
	public static void excluir( Integer id) {
		gestores.remove(id);
	}
	public static Collection<Gestor> obterLista( ) {
		return gestores.values();
	}
	public static Gestor obterPorId( Integer id) {
		return gestores.get(id);
	}
}
