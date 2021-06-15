package entidades;

public class Pessoa {
	public String nome;
	public String endereco;
	private long numeroTelefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String endereco, long numeroTelefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(long numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	
	
	
}
