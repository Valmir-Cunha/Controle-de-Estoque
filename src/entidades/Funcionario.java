package entidades;

import java.util.Scanner;

public class Funcionario extends Pessoa {
	private int id;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String endereco, String numeroTelefone, int id,double salario) {
		super(nome, endereco, numeroTelefone);
		this.id = id;
	}

	public int getId() {
		return id;
	}
           @Override
    public String toString() {
            return "" + getEndereco()
                            +";" + getNome() 
                            +";" + getNumeroTelefone()
                            +"\n";
    }
}
