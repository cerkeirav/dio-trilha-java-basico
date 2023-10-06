import interfaces.AparelhoTelefônico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefônico, ReprodutorMusical, NavegadorInternet{
	private boolean emChamada = false;
	private boolean tocandoMUsica = false;

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.abrirNavegador();
		iphone.ligar("9836278788");
		iphone.desligar();
		iphone.acessarSite("www.google.com");
		iphone.playMusica("Best part - HER");
		iphone.pauseMusica();
		iphone.enviarMsgDeTexto("Ola bom dia, estou encaminhando alguns itens a serem revisados.", "98983381");
	}
	@Override
	public void abrirNavegador() {
		System.out.println("Abrindo navegador Safari");
		
	}

	@Override
	public void acessarSite(String site) {
		System.out.println("Acessando o site:"+ site);
		
	}

	@Override
	public void pauseMusica() {
		if(tocandoMUsica == true) {
			System.out.println("Musica pausada");
			this.tocandoMUsica = false;
		}else {
			System.out.println("nenhuma musica esta sendo reproduzida");
		}
	}

	@Override
	public void ligar(String numero) {
		if(emChamada == false) {
			System.out.println("Ligando para:" + numero);
			this.emChamada = true;
		}else {
			System.out.println("Voce ja esta em uma chamada");
		}
		
	}

	@Override
	public void desligar() {
		if(emChamada == true) {
			System.out.println("Desligando a chamada");
			this.emChamada = false;
		}else {
			System.out.println("Voce nao esta em chamada");
		}
		
	}

	@Override
	public void enviarMsgDeTexto(String mensagem , String numero) {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Mensagem enviada com sucesso para o numero:" + numero );
		System.out.println(mensagem);
		System.out.println("----------------------------------------------------------");
	}

	@Override
	public void playMusica(String nomeMusica) {
		this.tocandoMUsica = true;
		System.out.println("Tocando agora: "+ nomeMusica);
		
	}

	public boolean isEmChamada() {
		return emChamada;
	}

	public void setEmChamada(boolean emChamada) {
		this.emChamada = emChamada;
	}

	public boolean isTocandoMUsica() {
		return tocandoMUsica;
	}

	public void setTocandoMUsica(boolean tocandoMUsica) {
		this.tocandoMUsica = tocandoMUsica;
	}

}
