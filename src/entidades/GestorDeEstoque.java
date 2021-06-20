package entidades;

import java.io.File;
import java.io.FileNotFoundException;
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
            Scanner entrada = new Scanner(System.in);
            String nome;
            System.out.println("Qual nome do produto?");
            nome = entrada.nextLine();
            File fw = new File ("dados\\Produtos\\"+nome+(".txt")); //Verifica se produto já está cadastrado.
            if (fw.exists()) {
                System.out.println("O produto já está cadastrado");
                
            } else { //Cadastrado o produto e faz o arquivo dele se o produto não estiver cadastrado.
                PrintWriter pw = new PrintWriter(fw);
                pw.println("Codigo: "+produto.getCodigoProduto());
                pw.println("Nome: "+produto.getNome());
                pw.println("Marca: "+produto.getMarca());
                pw.println("Preço: "+produto.getPreco());
                pw.println("Quantidade: "+produto.getQuantidadeEstoque());
                if(buscarCategoria(produto.getCategoria().getNomeCategoria())) {
                	pw.println("Categoria: "+produto.getCategoria().getNomeCategoria());
                }else {
                	cadastraCategoria(produto);
                	pw.println("Categoria: "+produto.getCategoria().getNomeCategoria());
                }           
                pw.println("----------------");
            	pw.flush();
            	pw.close();
            	entrada.close();
            }
    }
	
	public boolean buscarCategoria(String nome) {
		File categoria = new File ("dados\\Categoria\\"+nome+(".txt")); //Verifica a categoria já existe.
		if(categoria.exists()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void cadastraCategoria(Produto produto) throws IOException{
			FileWriter fw = new FileWriter ("dados\\Categorias\\"+produto.getCategoria().getNomeCategoria()+".txt",true);
	        PrintWriter pw = new PrintWriter(fw);
	        pw.println("Nome do produto: "+produto.getNome());
	        pw.println("----------------");
	        pw.flush();
	        pw.close();
	        fw.close();
		
	}
	
	public void excluirProdutos(Produto produto) {
            Scanner ler = new Scanner(System.in);
            String nome;
            System.out.println("Qual produto deseja excluir?");
            nome = ler.next();
            File fw = new File("dados\\Produtos\\"+nome+(".txt")); 
            if (fw.delete()) { 
                System.out.println("O produtofoi excluido");
            } else {
                System.out.println("O Produto não existe");
    } 		
	}
		
	public void alterarProduto(Produto produto) throws FileNotFoundException {
		try (Scanner entrada = new Scanner(System.in)) {
			String nome;
			System.out.println("Qual nome do produto?");
			nome = entrada.nextLine();
			int adicionar;
			System.out.println("Novo estoque: ");
			adicionar = entrada.nextInt();            
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + adicionar);
			File fw = new File ("dados\\Produtos\\"+nome+".txt");
			if (fw.exists()) {
			    try (PrintWriter pw = new PrintWriter(fw)) {
			        pw.println("Codigo: "+produto.getCodigoProduto());
			        pw.println("Nome: "+produto.getNome());
			        pw.println("Marca: "+produto.getMarca());
			        pw.println("Preço: "+produto.getPreco());
			        pw.println("Quantidade: "+produto.getQuantidadeEstoque());
			        pw.println("Categoria: "+produto.getCategoria());
			        pw.println("----------------");
			        pw.flush();
			    }//Adicionar catch
			}else {
			    System.out.println("O produto não existe");
			    //System.out.println("Deseja cadastrar o produto?");
			    
			}
		}
	}
}
