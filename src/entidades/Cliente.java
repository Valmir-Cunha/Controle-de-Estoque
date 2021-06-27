package entidades;

public class Cliente extends Pessoa{
	private double codigoCliente;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String endereco, long numeroTelefone, double codigoCliente) {
		super(nome, endereco, numeroTelefone);
		//Fazer um tratamento de excess�o
		if(verificarCodigoCliente(codigoCliente)) {
			this.codigoCliente = codigoCliente;
		}else {
		}
	}

	public double getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(double codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public boolean verificarCodigoCliente(double codigo) {
		//O codigo nao pode esta sendo utilizado por outro cliente
		if(true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void compras() {
		
	}
}
