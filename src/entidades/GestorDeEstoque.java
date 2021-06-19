package entidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorDeEstoque extends Funcionario {
	private int codigoGestorEstoque;

	public GestorDeEstoque(String nome, String endereco, long numeroTelefone, String login, String senha,
			double salario, int codigoGestorEstoque) {
		super(nome, endereco, numeroTelefone, login, senha, salario);
		this.codigoGestorEstoque = codigoGestorEstoque;
	}

	public void cadastrarProdutos(Produto produto) throws IOException {
            Scanner inteiro = new Scanner(System.in);
            String nome;
            System.out.println("Qual nome do produto?");
            nome = inteiro.next();
            File fw = new File (nome+(".txt")); //Verifica se produto já está cadastrado.
            if (fw.exists()) {
                System.out.println("O produto já está cadastrado");
                
            } else { //Cadastrado o produto e faz o arquivo dele se o produto não estiver cadastrado.
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
        }
        }
	
	public void excluirProdutos(Produto produto) {
		
	}
		
	public void alterarProduto(Produto produto) {
		
	}
}
