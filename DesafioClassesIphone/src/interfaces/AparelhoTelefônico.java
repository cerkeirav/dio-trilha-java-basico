package interfaces;

public interface AparelhoTelefônico {
	void ligar(String numero);
	void desligar();
	void enviarMsgDeTexto(String mensagem, String numero);
}
