package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Administrador extends Funcionario {
	private int codigoAdministrador;
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, long numeroTelefone, String login, String senha, double salario,
			int codigoAdministrador) {
		super(nome, endereco, numeroTelefone, login, senha,salario);
		this.codigoAdministrador = codigoAdministrador;
	}

	public int getCodigoAdministrador() {
		return codigoAdministrador;
	}

	public void setCodigoAdministrador(int codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}
	
	public void cadastrarCliente(Cliente cliente) throws FileNotFoundException {
		 Scanner entrada = new Scanner(System.in);
         String nome;
         System.out.println("Qual nome do cliente?"); //Mudar a comparação
         nome = entrada.next();
         File fw = new File ("dados\\Clientes\\"+nome+(".txt")); //Verifica se o cliente já está cadastrado.
         if (fw.exists()) {
             System.out.println("O cliente já está cadastrado");
             
         } else { //Cadastra o cliente e faz o arquivo dele se não estiver cadastrado.
             PrintWriter pw = new PrintWriter(fw);
             pw.println("Código do cliente: " +cliente.getCodigoCliente());
             pw.println("Nome: "+cliente.getNome());
             pw.println("Endereço: "+cliente.getEndereco());
             pw.println("Número de telefone: "+cliente.getNumeroTelefone());
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
        System.out.println("Qual nome do vendedor?"); //Mudar a comparação
        nome = entrada.next();
        File fw = new File ("dados\\Funcionarios\\Vendedores\\"+nome+(".txt")); //Verifica se o cliente já está cadastrado.
        if (fw.exists()) {
            System.out.println("O cliente já está cadastrado");
            
        } else { //Cadastra o cliente e faz o arquivo dele se não estiver cadastrado.
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Código do vendedor: " +vendedor.getCodigoVendedor());
            pw.println("Nome: "+vendedor.getNome());
            pw.println("Endereço: "+vendedor.getEndereco());
            pw.println("Número de telefone: "+vendedor.getNumeroTelefone());
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
