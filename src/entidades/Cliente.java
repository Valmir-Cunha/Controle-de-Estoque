package entidades;

import java.util.List;

public class Cliente extends Pessoa{
	private double codigoCliente;
	private List<Produto> carrinho;
	private List<Vendas> comprasFeitas;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String endereco, long numeroTelefone, double codigoCliente) {
		super(nome, endereco, numeroTelefone);
		this.codigoCliente = codigoCliente;
	}

	public double getCodigoCliente() {
		return codigoCliente;
	}
	
	public void compras() {
		
	}
}
