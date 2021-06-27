package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Categoria;
import entidades.Produto;

public class  Estoque implements FuncoesEstoque {
	private int idProdutos = 0;
	private int idCategoria = 0;
	private List<Produto> produtosCadastrados = new ArrayList<>();
	private List<Produto> produtosDisponiveis = new ArrayList<>();
	private List<Produto> produtosIndisponiveis = new ArrayList<>();
	private List<Produto> produtosExcluidos = new ArrayList<>();
	private List<Categoria> categorias = new ArrayList<>();
	
	public List<Produto> getProdutosCadastrados() {
		return produtosCadastrados;
	}

	public List<Produto> getProdutosDisponiveis() {
		return produtosDisponiveis;
	}

	public List<Produto> getProdutosIndisponiveis() {
		return produtosIndisponiveis;
	}

	public List<Produto> getProdutosExcluidos() {
		return produtosExcluidos;
	}
		
	public List<Categoria> getCategorias() {
		return categorias;
	}

	@Override
	public void exibirProdutosCadastrados() {
		System.out.println("Produtos cadastrados: ");
		for (Produto produto : produtosCadastrados) {
			System.out.println(produto);
		}
	}
	
	@Override
	public void exibirProdutosDisponiveis() {
		System.out.println("Produtos cadastrados: ");
		for (Produto produto : produtosCadastrados) {
			System.out.println(produto);
		}
	}

	@Override
	public void exibirProdutosIndisponiveis() {
		System.out.println("Produtos cadastrados: ");
		for (Produto produto : produtosCadastrados) {
			System.out.println(produto);
		}
	}

	@Override
	public void exibirProdutosExcluidos() {
		System.out.println("Produtos cadastrados: ");
		for (Produto produto : produtosCadastrados) {
			System.out.println(produto);
		}
	}	
	
	public void exibirCategorias() {
		System.out.println("Categorias: ");
		for (Categoria categoria: categorias) {
			System.out.println(categoria);
		}
	}
}
