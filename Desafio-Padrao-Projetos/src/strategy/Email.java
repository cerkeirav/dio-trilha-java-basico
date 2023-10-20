package strategy;

public class Email {
	private String remetente;
	private String assunto;
	private String mensagem;
	
	public Email(String remetente, String msg, String assunto) {
		this.mensagem  = msg;
		this.assunto   = assunto;
		this.remetente = remetente;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
}
