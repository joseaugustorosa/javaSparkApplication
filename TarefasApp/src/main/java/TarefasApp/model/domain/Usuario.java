package TarefasApp.model.domain;

public class Usuario {
	private String nome;
	private String email;
	private int idade;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Usuario() {
		this.setNome("José Augusto");
	}
	public Usuario(String nome) {
		this.setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
	
		return "A inclusão do usuario " + nome + " foi realizada com sucesso.";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
