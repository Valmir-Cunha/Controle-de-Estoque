package entidades;

import java.util.List;

public class Vendas {
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Vendas(Cliente cliente, Vendedor vendedor) {
            super();
            this.cliente = cliente;
            this.vendedor = vendedor;
    }

    public double calcularValorTotal() {
            double total = 0;
            for(Produto produto: produtos) {
                    total = produto.getPreco() * produto.getQuantidadeEstoque() + total; ///modificar quantidade
            }
            return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
        
        
}
