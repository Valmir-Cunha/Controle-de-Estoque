package entidades;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String numeroTelefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String endereco, String numeroTelefone) {
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

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	
	
	
}
