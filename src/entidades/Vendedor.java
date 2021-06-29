package entidades;

public class Vendedor extends Funcionario {
	
	
	public Vendedor(String nome, String endereco, long numeroTelefone, int id, String login, String senha, double salario) {
		super(nome, endereco, numeroTelefone, id, login, senha, salario);
	}

	public void modificarSenha() {
	}
	
	public void iniciarVenda() {
		Cliente cliente = new Cliente();
		Vendas venda = new Vendas(cliente,this);
		
	}
}
