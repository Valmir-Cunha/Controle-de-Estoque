package entidades;

public class Vendedor extends Funcionario {
	private int codigoVendedor;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, String endereco, long numeroTelefone, String login, String senha, int codigoVendedor) {
		super(nome, endereco, numeroTelefone, login, senha);
		this.codigoVendedor = codigoVendedor;
	}

	
	public void modificarSenha() {
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	
	
}
