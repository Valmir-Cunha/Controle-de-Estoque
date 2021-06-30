package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicos.Estoque;

public class GestorDeEstoque extends Funcionario {
	private Estoque estoque; 
    //private List<Produto> produtos = new ArrayList<>();
	
	public GestorDeEstoque(String nome, String endereco, long numeroTelefone, int id, String login, String senha,
			double salario, Estoque estoque) {
		super(nome, endereco, numeroTelefone, id, login, senha, salario);
		this.estoque = estoque;
	}
	
	public void cadastrarProdutos() {
		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Por favor, digite os dados do produto a seguir!");
        System.out.println("Codigo: ");
        produto.setCodigoProduto(entrada.nextInt());
        System.out.println("Nome: ");
        produto.setNome(entrada.nextLine());
        entrada.next();
        System.out.println("Marca: ");
        produto.setMarca(entrada.nextLine());
        entrada.next();
        System.out.println("Preco: ");
        produto.setPreco(entrada.nextDouble());
        System.out.println("Quantidade: ");
        produto.setQuantidadeEstoque(entrada.nextInt());
        System.out.println("Digite o nome da categoria: ");
        produto.setCategoria(buscarCategoria(entrada.nextLine()));
		for (Produto produtoArray : estoque.getProdutosCadastrados()) {
			if(produtoArray.getCodigoProduto() == produto.getCodigoProduto()) {
				System.out.println("Um produto de mesmo codigo ja esta cadastrado, "
						+ "nao eh possivel ter dois produto de mesmo codigo");
			}
		}
		estoque.getProdutosCadastrados().add(produto);
		entrada.close();
	}

	public void alterarProduto(Produto produto) {
		Scanner entrada = new Scanner(System.in);
		for (Produto produtoArray : estoque.getProdutosCadastrados()) {
			if(produtoArray.equals(produto)) {
				System.out.println("Por favor, digite os dados do produto a seguir!");
		        System.out.println("Codigo: ");
		        produto.setCodigoProduto(entrada.nextInt());
		        System.out.println("Nome: ");
		        produto.setNome(entrada.nextLine());
		        entrada.next();
		        System.out.println("Marca: ");
		        produto.setMarca(entrada.nextLine());
		        entrada.next();
		        System.out.println("Preco: ");
		        produto.setPreco(entrada.nextDouble());
		        System.out.println("Quantidade: ");
		        produto.setQuantidadeEstoque(entrada.nextInt());
		        System.out.println("Digite o nome da categoria: ");
		        produto.setCategoria(buscarCategoria(entrada.nextLine()));
			}
		}
		entrada.close();
	}
	
	
	public void excluirProdutos(Produto produto) {
		for (Produto produtoArray : estoque.getProdutosCadastrados()) {
			if(produtoArray.equals(produto)) {
				estoque.getProdutosCadastrados().remove(produto);
				estoque.getProdutosExcluidos().add(produto);
				System.out.println("Produto excluido");
			}
		}
	}
	
	/*public void cadastrarProdutos(Produto produto) throws IOException {
          produtos.add(produto);
          System.out.println("Codigo: "+produto.getCodigoProduto());
          System.out.println("Nome: "+produto.getNome());
          System.out.println("Marca: "+produto.getMarca());
          System.out.println("Preco: "+produto.getPreco());
          System.out.println("Quantidade: "+produto.getQuantidadeEstoque());
          System.out.println("Categoria: "+produto.getCategoria());
    }
	
	public boolean buscarCategoria(String nome) {
		File categoria = new File ("dados\\Categoria\\"+nome+(".txt")); //Verifica a categoria j� existe.
		if(categoria.exists()) {
			return true;
		}else {
			return false;
		}
	}
	*/
	public Categoria buscarCategoria(String nome) {
		for (Categoria categoria: estoque.getCategorias()) {
			if(categoria.getNomeCategoria().equals(nome)) {
				return categoria;
			}
		}
		return cadastrarCategoria(nome);
	}
	
	public Categoria cadastrarCategoria(String nome) {
		Categoria categoria = new Categoria(nome,9999); //id temporario
		estoque.getCategorias().add(categoria);
		return categoria;
	}
	
	public void excluirCategoria(Categoria categoria) {
		if(estoque.getCategorias().remove(categoria)) {
			System.out.println("Categoria excluida");
		}else {
			System.out.println("Categoria nao existe/ nao encontrada");
		}
	}
        public void salvar() throws FileNotFoundException, IOException{
            try (FileOutputStream f = new FileOutputStream(new File("\\dados\\Produtos.txt"),true)) {
                ObjectOutputStream o = new ObjectOutputStream(f);
                o.writeObject(estoque.getProdutosCadastrados().toString());
                o.close();
            }
       }
	
	/*
	public void cadastraCategoria(Produto produto) throws IOException{
			FileWriter fw = new FileWriter ("dados\\Categorias\\"+produto.getCategoria().getNomeCategoria()+".txt",true);
	        PrintWriter pw = new PrintWriter(fw);
	        pw.println("Nome do produto: "+produto.getNome());
	        pw.println("----------------");
	        pw.flush();
	        pw.close();
	        fw.close();
		
	}
	*/
	/*public void excluirProdutos(Produto produto) {
            Scanner ler = new Scanner(System.in);
            String nome;
            System.out.println("Qual produto deseja excluir?");
            nome = ler.next();
            File fw = new File("dados\\Produtos\\"+nome+(".txt")); 
            if (fw.delete()) { 
                System.out.println("O produto foi excluido");
            } else {
                System.out.println("O Produto nao existe");
			}
			ler.close();
	}*/
	
	/*
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
			        pw.println("Pre�o: "+produto.getPreco());
			        pw.println("Quantidade: "+produto.getQuantidadeEstoque());
			        pw.println("Categoria: "+produto.getCategoria());
			        pw.println("----------------");
			        pw.flush();
			    }//Adicionar catch
			}else {
			    System.out.println("O produto n�o existe");
			    //System.out.println("Deseja cadastrar o produto?");
			    
			}
		}
	}*/
}
