package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Categoria;
import entidades.Produto;

public class  Estoque implements FuncoesEstoque {
    private int idProdutos = 1;
    private int idCategoria = 1;
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private List<Produto> produtosDisponiveis = new ArrayList<>();
    private List<Produto> produtosIndisponiveis = new ArrayList<>();
    private List<Produto> produtosExcluidos = new ArrayList<>();
    private List<Categoria> categorias = new ArrayList<>();

    public int getIdProdutos() {
        return idProdutos;
    }
    
    public int setIdProdutos() {
        return idProdutos++;
    }

    public int getIdCategoria() {
        return idCategoria;
    }
    
    public void setIdCategoria() {
        idCategoria++;
    }

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
        for (Produto produto : produtosCadastrados) {
                System.out.println(produto.toString());
        }
    }

    @Override
    public void exibirProdutosDisponiveis() {
        for (Produto produto : produtosCadastrados) {
                System.out.println(produto);
        }
    }

    @Override
    public void exibirProdutosIndisponiveis() {
        for (Produto produto : produtosCadastrados) {
                System.out.println(produto);
        }
    }

    @Override
    public void exibirProdutosExcluidos() {
        for (Produto produto : produtosCadastrados) {
                System.out.println(produto);
        }
    }	

    public void exibirCategorias() {
        for (Categoria categoria: categorias) {
                System.out.println(categoria);
        }
    }
    
    public String encontrarProdutoCodigo(int i){
        for (Produto produto : produtosCadastrados) {
                if(produto.getCodigoProduto() == i){
                    return produto.getNome();
                }
            }
        return null;
    }
    
    public Produto encontrarProdutoCod(int i){
        for (Produto produto : produtosCadastrados) {
                if(produto.getCodigoProduto() == i){
                    return produto;
                }
            }
        return null;
    }
    
    public int encontrarProdutoNome(String nome){
        for (Produto produto : produtosCadastrados) {
                if(produto.getNome().equals(nome)){
                    return produto.getCodigoProduto();
                }
            }
        return -1;
    }
    
    public Categoria encontrarCategoriaCodigo(int i){
        for (Categoria categoria : categorias) {
                if(categoria.getCodigoCategoria() == i){
                    //return produto.getNome();
                    return categoria;
                }
            }
        return null;
    }
    
    public Categoria encontrarCategoriaNome(String nome){
        for (Categoria categoria : categorias) {
                if(categoria.getNomeCategoria().equals(nome)){
                    return categoria;
                }
            }
        return null;
    }
}
