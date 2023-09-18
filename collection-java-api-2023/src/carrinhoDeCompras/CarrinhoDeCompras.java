package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaDeCompras;
	
	public CarrinhoDeCompras() {
		this.listaDeCompras = new ArrayList<>();
	}
	
	public void adicionarItem(Item item) {
		listaDeCompras.add(item);
		System.out.println("Item adicionado com suecsso ao carrinho de compras!");
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<>();
		boolean removeu = false;
		for (Item item : listaDeCompras) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensRemover.add(item);
				removeu = true;
			}
			
		}
		listaDeCompras.removeAll(itensRemover);
		if(removeu == true) {
			System.out.println("Item removido com sucesso doa carrinho!");
		}else {
			System.out.println("Esse item não existe em seu carrinho.");
		}
	}
	
	public double calcularTotal() {
		double valorFinal = 0;
		if(listaDeCompras.isEmpty()) {
			System.out.println("Seu carrinho esta vazio!");
		}else {
			for (Item item : listaDeCompras) {
				valorFinal += item.getQuantidade() * item.getPreco();
			}
			System.out.println("O valor do seu seu carrinho e: " + valorFinal);
		}
		
		return valorFinal;
	}
	public void exibirItens() {
		System.out.println(listaDeCompras.toString());
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras listaDeCompras = new CarrinhoDeCompras();
		Item produto01 = new Item("Feijao", 2, 3.50);
		Item produto02 = new Item("Coca Cola", 2, 5.00);
		Item produto03 = new Item("Pao de forma", 2, 6.00);
		listaDeCompras.adicionarItem(produto01);
		listaDeCompras.adicionarItem(produto02);
		listaDeCompras.adicionarItem(produto03);
		listaDeCompras.removerItem("feijao");
		listaDeCompras.exibirItens();
		listaDeCompras.calcularTotal();
	
	
	}
}
