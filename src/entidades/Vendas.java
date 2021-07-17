package entidades;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
    int id;
    private Cliente cliente;
    private Produto produto;
    private List<Produto> produtos = new ArrayList<>();
    private double precoTotal = 0;

    public Vendas() {
    }
    
    public Vendas(int id) {
        this.id = id;
    }

    public double calcularValorTotal() {
            double total = 0;
            for(Produto produto: produtos) {
                    total = produto.getPreco() * produto.getQuantidadeEstoque() + total; ///modificar quantidade
            }
            return total;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }   
        @Override
    public String toString() {
            return "" + cliente.getNome()
                            +";" + id
                            +";" + precoTotal
                            +"\n";
    }
    public String toString2() {
            return "" + produtos
                            +"\n";
    }
    
}
