package entidades;

public class Administrador extends Pessoa {
	private String login;
	private String senha;
	private int codigoVendedor;
	
	public Administrador() {
		super();
	}

	public Administrador(String nome, String endereco, long numeroTelefone, String login, String senha,int codigoVendedor) {
		super(nome, endereco, numeroTelefone);
		this.login = login;
		this.senha = senha;
		this.codigoVendedor = codigoVendedor;
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
	
	public void cadastrarCliente() {
		
	}
	
	public void excluirCliente() {
			
	}
	public void cadastrarVendedor() {
		
	}
	
	public void excluirVendedor() {
		
	}

}
