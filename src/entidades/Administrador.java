package entidades;

public class Administrador extends Funcionario {
	private int codigoAdministrador;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, long numeroTelefone, String login, String senha,
			int codigoAdministrador) {
		super(nome, endereco, numeroTelefone, login, senha);
		this.codigoAdministrador = codigoAdministrador;
	}


	public void modificarSenha() {
		
	}
	
	public void modificarLogin() {
		
	}

	public int getCodigoAdministrador() {
		return codigoAdministrador;
	}

	public void setCodigoAdministrador(int codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
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
