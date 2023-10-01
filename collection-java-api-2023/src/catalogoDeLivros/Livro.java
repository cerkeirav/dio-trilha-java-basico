package catalogoDeLivros;

public class Livro {
	private String titulo;
	private String autor;
	private Integer anoPublicacao;
	
	public Livro(String titulo, String autor, Integer ano) {
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacao = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
}
