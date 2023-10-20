package cerkeirav.springboot;

public class Remetente {
	private String nome;
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
	
		return "Remetente { " + "Nome= " + nome + "e-mail= " + email + "}";
	}
	
	
}
