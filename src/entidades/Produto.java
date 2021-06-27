package entidades;

public class Produto {
	private int codigoProduto;
	private String nome;
	private String marca;
	private double preco;
	private int quantidadeEstoque;
	private Categoria categoria;

	public Produto() {
	}
	
	public Produto(int codigoProduto, String nome, String marca, double preco, int quantidadeEstoque,
			Categoria categoria) {
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Nome: " + nome 
				+"\nCodigo do Produto: " + codigoProduto 
				+"\nMarca: " + marca 
				+"\nPreco do protudo: " + preco
				+ "\nQuantidade no estoque: " + quantidadeEstoque 
				+"\nCategoria: " + categoria
				+"\n--------------------------------------------------------";
	}
	
	
}
