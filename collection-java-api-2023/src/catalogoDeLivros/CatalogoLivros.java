package catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listaDeLivros;

	public CatalogoLivros() {
		this.listaDeLivros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		listaDeLivros.add(livro);
		System.out.println("Livro adicionado a lista");
	}
	
	public void pesquisarAutor(String autor){
		List<Livro> listaDoAutor = new ArrayList<>();
		for (Livro livro : listaDeLivros) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				listaDoAutor.add(livro);
			}
		}if(listaDoAutor.isEmpty()) {
			System.out.println("Nao existem livros desse autor na sua lista.");
		}else {
			System.out.println("Os livros do autor: "+ autor + " sao:");
			for (Livro livro : listaDoAutor) {
				System.out.println(livro.getTitulo() + "\n");
			}
		}
	
	}
	public void pesquisarTitulo(String titulo){
		List<Livro> listaDeTitulos = new ArrayList<>();
		for (Livro livro : listaDeLivros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				listaDeTitulos.add(livro);
			}
		}if(listaDeTitulos.isEmpty()) {
			System.out.println("Nao existem livros com esse titulo na sua lista.");
		}else {
			System.out.println("Voce possui o livro: " + titulo + " em sua lista");
		}
	
	}
	
	public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal ){
		List<Livro> listaLivros = new ArrayList<>();
		if(!listaDeLivros.isEmpty()) {
			for (Livro livro : listaDeLivros) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					listaLivros.add(livro);
				}
			}
		}
		System.out.println("o livro nesse intervalo e: ");
		for (Livro livro : listaLivros) {
			System.out.println(livro.getTitulo());
		}
		
		return listaLivros;
		
	}
	
	public static void main(String[] args) {
		Livro livro01 = new Livro("O capital", "Karl Marx", 1920);
		Livro livro02 = new Livro("Memorias postumas de Bras Cubas", "Bras Cubas", 1950);
		Livro livro03 = new Livro("Mais Valia", "Karl Marx", 1920);
		Livro livro04 = new Livro("Mulher de fim de tarde", "Bras Cubas", 2000);
		CatalogoLivros listaLivros = new CatalogoLivros();
		listaLivros.adicionarLivro(livro01);
		listaLivros.adicionarLivro(livro02);
		listaLivros.adicionarLivro(livro03);
		listaLivros.adicionarLivro(livro04);
		listaLivros.pesquisarAutor("Bras Cubas");
		listaLivros.pesquisarTitulo("O capital");
		listaLivros.pesquisarPorIntervaloDeAno(1910, 1930);
	}
}
