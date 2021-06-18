package entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorDeEstoque extends Funcionario {
	private int codigoGestorEstoque;

	public GestorDeEstoque(String nome, String endereco, long numeroTelefone, String login, String senha,
			double salario, int codigoGestorEstoque) {
		super(nome, endereco, numeroTelefone, login, senha, salario);
		this.codigoGestorEstoque = codigoGestorEstoque;
	}

	public void cadastrarProdutos(Produto produto) throws IOException {
		//Procurar se produto jja existe pelo código
		FileWriter fw = new FileWriter ("dados\\Produtos.txt",true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Codigo: "+produto.getCodigoProduto());
        pw.println("Nome: "+produto.getNome());
        pw.println("Marca: "+produto.getMarca());
        pw.println("Preço: "+produto.getPreco());
        pw.println("Quantidade: "+produto.getQuantidadeEstoque());
        pw.println("Categoria: "+produto.getCategoria());
        pw.println("----------------");
        pw.flush();
        pw.close();
        fw.close();
	}
	
	public void excluirProdutos(Produto produto) {
		
	}
		
	public void alterarProduto(Produto produto) {
		
	}
}
