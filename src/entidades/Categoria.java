package entidades;

public class Categoria{
	private String nomeCategoria;
	private int codigoCategoria;
	
	public Categoria(String nomeCategoria, int codigoCategoria) {
		super();
		this.nomeCategoria = nomeCategoria;
		this.codigoCategoria = codigoCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	
	
}
