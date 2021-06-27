package banco;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import entidades.Cliente;
import entidades.Vendas;
import servicos.Administracao;
import servicos.Estoque;
import entidades.Funcionario;
import entidades.Produto;

public class Arquivos {
	Estoque estoque;
	Administracao administracao;
	
	public Arquivos(Estoque estoque,Administracao administracao) {
		this.estoque = estoque;
		this.administracao = administracao;
	}

	public void registrarClientes() {
		try {
			File file = new File("dados\\Clientes.dat");
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
            for (Cliente cliente : administracao.getClientes()) {
            	output.writeObject(cliente);
    		} 
		} catch(Exception e){
            System.out.println(e.toString());
		}
	}
	
	public void registrarFuncionarios() {
		
	}
	
	public void registrarVendas() {
		
	}
	
	public void registrarProdutos(){
	
	}
	
	public void registrarProdutosIndisponiveis() {
		
	}
	
	public void registrarProdutosExcluidos() {
		
	}
	
	public void carregarClientes() {
		
	}
	
	public void carregarFuncionarios() {
		
	}
	
	public void carregarVendas() {
		
	}
	
	public void carregarProdutos() {
		
	}
	
	public void carregarProdutosIndisponiveis() {
		
	}
	
	public void carregarProdutosExcluidos() {
		
	}
}
