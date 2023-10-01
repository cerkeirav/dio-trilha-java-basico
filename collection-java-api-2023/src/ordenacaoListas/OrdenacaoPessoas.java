package ordenacaoListas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> listaDePessoas;
	
	public OrdenacaoPessoas() {
		this.listaDePessoas = new ArrayList<>();	
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
		Collections.sort(pessoasPorIdade);
		return listaDePessoas;
	}
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return listaDePessoas;
	}
	
	
}
