package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import servicos.Estoque;
import servicos.Administracao;

public class Administrador extends Funcionario {
	private Estoque estoque; 
	private Administracao gerencia;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, long numeroTelefone, int id, String login, String senha,
			double salario, Estoque estoque, Administracao gerencia) {
		super(nome, endereco, numeroTelefone, id, login, senha, salario);
		this.estoque = estoque;
		this.gerencia = gerencia;
	}

	public void cadastrarCliente(Cliente cliente) throws FileNotFoundException {
		 Scanner entrada = new Scanner(System.in);
         String nome;
         System.out.println("Qual nome do cliente?");
         nome = entrada.next();
         File fw = new File ("dados\\Clientes\\"+nome+(".txt"));
         if (fw.exists()) {
             System.out.println("O cliente j� est� cadastrado");
             
         } else { //Cadastra o cliente e faz o arquivo dele se n�o estiver cadastrado.
             PrintWriter pw = new PrintWriter(fw);
             pw.println("C�digo do cliente: " +cliente.getCodigoCliente());
             pw.println("Nome: "+cliente.getNome());
             pw.println("Endere�o: "+cliente.getEndereco());
             pw.println("N�mero de telefone: "+cliente.getNumeroTelefone());
             pw.println("----------------");
         	 pw.flush();
         	 pw.close();
         }
         entrada.close();
	}
	
	public void excluirCliente() {
			
	}
	
	public void cadastrarVendedor(Vendedor vendedor) throws FileNotFoundException {
		Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Qual nome do vendedor?"); //Mudar a compara��o
        nome = entrada.next();
        File fw = new File ("dados\\Funcionarios\\Vendedores\\"+nome+(".txt")); //Verifica se o cliente j� est� cadastrado.
        if (fw.exists()) {
            System.out.println("O cliente j� est� cadastrado");
            
        } else { //Cadastra o cliente e faz o arquivo dele se n�o estiver cadastrado.
            PrintWriter pw = new PrintWriter(fw);
            pw.println("C�digo do vendedor: " +vendedor.getId());
            pw.println("Nome: "+vendedor.getNome());
            pw.println("Endere�o: "+vendedor.getEndereco());
            pw.println("N�mero de telefone: "+vendedor.getNumeroTelefone());
            pw.println("Login: "+vendedor.getLogin());
            pw.println("Senha: "+vendedor.getSenha());
            pw.println("----------------");
        	pw.flush();
        	pw.close();
        }
        entrada.close();
	}
	
	public void excluirVendedor() {
		
	}

}
