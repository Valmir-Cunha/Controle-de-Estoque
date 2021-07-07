package entidades;

import java.util.List;

public class Cliente extends Pessoa{
	private int codigoCliente;
	private List<Produto> carrinho;
	private List<Vendas> comprasFeitas;
	
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
	
	public void compras() {
		
	}
}
