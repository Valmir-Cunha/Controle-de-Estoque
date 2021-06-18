package entidades;

public class Vendedor extends Funcionario {
	private int codigoVendedor;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, String endereco, long numeroTelefone, String login, String senha, double salario, int codigoVendedor) {
		super(nome, endereco, numeroTelefone, login, senha, salario);
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
