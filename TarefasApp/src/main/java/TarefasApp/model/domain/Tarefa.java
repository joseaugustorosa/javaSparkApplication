package TarefasApp.model.domain;

public class Tarefa {
	private Integer id;
	private String descricao;
	private String titulo;
	private Funcionario funcionario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Tarefa() {
		this.setDescricao("PADRÃO");
		this.setTitulo("PADRÃO");
		this.setFuncionario(new Funcionario("José Augusto","Analista de Desenvolvimento"));
		
	}
	public Tarefa(String titulo) {
		this.setTitulo(titulo);
			
	}
	public Tarefa(String titulo, String descricao) {
		this.setDescricao(descricao);
		this.setTitulo(titulo);
		}
	public Tarefa(String titulo, String descricao,Funcionario funcionario) {
		this.setDescricao(descricao);
		this.setTitulo(titulo);
		this.setFuncionario(funcionario);
	}
	
	@Override
	public String toString() {
		
		return "Tarefa : \nTítulo : " + titulo + " \nDescrição: " + descricao  + "\nResponsável: " + funcionario;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo = titulo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
