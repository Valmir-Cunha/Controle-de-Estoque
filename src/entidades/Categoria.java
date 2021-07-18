package entidades;

import java.util.ArrayList;
import java.util.List;

public class Categoria{
    private String nomeCategoria;
    private int codigoCategoria;
    private List<Produto> produtos = new ArrayList<>();
    
     public Categoria() {
    }
     
    public Categoria(String nomeCategoria, int codigoCategoria) {
            super();
            this.nomeCategoria = nomeCategoria;
            this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
            return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
            this.nomeCategoria = nomeCategoria;
    }

    public int getCodigoCategoria() {
            return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
            this.codigoCategoria = codigoCategoria;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    @Override
    public String toString() {
            return "" + nomeCategoria 
                            +";" + codigoCategoria 
                            +"\n";
    }
    public String toString2() {
            return "" + produtos
                            +"\n";
    }
    
}
