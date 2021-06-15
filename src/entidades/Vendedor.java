package entidades;

public class Vendedor extends Pessoa {
	private String login;
	private String senha;
	private int codigoVendedor;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nome, String endereco, long numeroTelefone, String login, String senha,int codigoVendedor) {
		super(nome, endereco, numeroTelefone);
		this.codigoVendedor = codigoVendedor;
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public void modificarSenha() {
		
	}
	
	public void modificarLogin() {
		
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	
	
}
