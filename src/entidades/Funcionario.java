package entidades;

public class Funcionario extends Pessoa {
	private String login;
	private String senha;
	private double salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String endereco, long numeroTelefone, String login, String senha,double salario) {
		super(nome, endereco, numeroTelefone);
		this.login = login;
		this.senha = senha;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
