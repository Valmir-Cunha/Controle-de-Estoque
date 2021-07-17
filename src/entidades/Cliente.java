package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private int codigoCliente;
    private List<Vendas> compras = new ArrayList<>();

    public Cliente() {
            super();
    }

    public Cliente(String nome, String endereco, String numeroTelefone, int codigoCliente) {
            super(nome, endereco, numeroTelefone);
            this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
            return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public List<Vendas> getCompras() {
        return compras;
    }
    
    public Vendas encontrarVenda(int id){
        try{
            for(Vendas venda: this.getCompras() ){
                if(venda.getId() == id){
                    return venda;
                }
            }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

        @Override
    public String toString() {
          return "" + getNome()
                           +";" + getNumeroTelefone() 
                           +";" + getEndereco()
                           +";" + codigoCliente
                           +"\n";
    } 
}
