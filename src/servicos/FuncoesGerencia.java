package servicos;

import java.util.List;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Vendas;

public interface FuncoesGerencia {
	public List<Cliente> listaClientes();
	public List<Cliente> listaClientesExcluidos();
	public List<Vendas> listaVendas();
	public List<Funcionario> listaFuncionarios();
}
