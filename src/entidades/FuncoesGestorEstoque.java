/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public interface FuncoesGestorEstoque {
    public boolean cadastrarProdutos(Produto produto);

    public boolean editarProduto(int id, String nome, String marca, double preco, int quantidadeEstoque, Categoria categoria);
    public void excluirProdutos(Produto produto);
    public boolean buscarCategoria(int id,String nome);
    public boolean cadastrarCategoria(int id,String nome);
    public Categoria buscarCategoria(int id);
    public boolean excluirCategoria(int i);
    public boolean editarCategoria(int id, String nome);
    public void adicionarProdutoCategoria(Categoria categoria, Produto produto);
    public void trocarCategoriaProduto(Produto produto, String categoriaNova);
}
