package entidades;

import java.util.Scanner;

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
	
	public void modificarLogin() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha atual:");
		if(validarSenha(entrada.nextLine())) {
			//Busca se login está livre
			System.out.println("Digite seu novo login: ");
			this.login = entrada.nextLine();
		}else {
			System.out.print("Senhas nao conferem! \nTente navamente.");
		}
		entrada.close();
	}

	public String getSenha() {
		return senha;
	}
	
	public boolean validarSenha(String senha) {
		if(senha.equals(this.senha)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void modificarSenha() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha atual:");
		if(validarSenha(entrada.nextLine())) {
			System.out.println("Digite sua nova senha: ");
			this.senha = entrada.nextLine();
		}else {
			System.out.print("Senhas nao conferem! \nTente navamente.");
		}
		entrada.close();
	}

	public double getSalario() {
		return salario;
	}

	
}
