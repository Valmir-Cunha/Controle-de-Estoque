package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Categoria;
import entidades.Produto;

public class  Estoque {
    private int idProdutos = 1;
    private int idCategoria = 1;
    private List<Produto> produtosCadastrados = new ArrayList<>();
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

    public List<Produto> getProdutosExcluidos() {
            return produtosExcluidos;
    }

    public List<Categoria> getCategorias() {
            return categorias;
    }

    public void exibirCategorias() {
        for (Categoria categoria: categorias) {
                System.out.println(categoria);
        }
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
    
    public Produto encontrarProdNome(String nome){
        for (Produto produto : produtosCadastrados) {
                if(produto.getNome().equals(nome)){
                    return produto;
                }
            }
        return null;
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
