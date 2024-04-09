package TarefasApp.model.domain;

public class Funcionario {

	private Integer id;
	private String nome;
	private int contrato;
	private String cargo;
	
	public Funcionario() {
		this.setCargo("Analista de Desenvolvimento");
		this.setNome("José Augusto");
		this.setContrato(03310);
	}
	public Funcionario(String nome, String cargo) {
		this.setCargo(cargo);
		this.setNome(nome);
	}
	public Funcionario(String nome, String cargo, int contrato) {
		this.setCargo(cargo);
		this.setNome(nome);
		this.setContrato(contrato);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		
		return "Funcionario: " + nome + "| Cargo: " + cargo + "| ID: " + id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContrato() {
		return contrato;
	}
	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
