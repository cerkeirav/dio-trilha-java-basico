package carrinhoDeCompras;

public class Item {
	private String nome;
	private int quantidade;
	private double preco;
	
	public Item (String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		String numeroQuantidade = "";
		String numeroValor = "";
		try {
			numeroQuantidade = Integer.toString(quantidade);
			numeroValor = Double.toString(preco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String produto =  "\n" + "Produto: " + nome + "\n" + "Quantidade: "  + numeroQuantidade + "\n" + "Valor: "  + numeroValor + "\n";
		return produto;
	}
	
}
