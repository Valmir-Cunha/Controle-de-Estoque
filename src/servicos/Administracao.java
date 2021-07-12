package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import entidades.Funcionario;
import entidades.Vendas;



public class Administracao implements FuncoesAdministracao{
    private int idClientes = 1;
    private int idFuncionario = 1;
    private List<Cliente> Clientes = new ArrayList<>();
    private List<Cliente> ClientesExcluidos = new ArrayList<>();
    private List<Funcionario> Funcionarios = new ArrayList<>();
    private List<Vendas> listaVendas = new ArrayList<>();

    public Administracao() {
    }

    public Administracao(int c, int f) {
        idClientes = c;
        idFuncionario = f;
    }
    
    
    public int getIdClientes() {
            return idClientes;
    }
    
    public void setIdClientes() {
            idClientes++;
    }

    public int getIdFuncionario() {
            return idFuncionario;
    }

    public List<Cliente> getClientes() {
            return Clientes;
    }

    public List<Cliente> getClientesExcluidos() {
            return ClientesExcluidos;
    }

    public List<Funcionario> getFuncionarios() {
            return Funcionarios;
    }

    public List<Vendas> getListaVendas() {
            return listaVendas;
    }

    @Override
    public void exibirListaClientes() {
            System.out.println("Clientes cadastrados: ");
            for (Cliente cliente : Clientes) {
                    System.out.println(cliente);
            }
    }

    @Override
    public void exibirListaClientesExcluidos() {
            System.out.println("Clientes excluidos: ");
            for (Cliente cliente : Clientes) {
                    System.out.println(cliente);
            }
    }

    @Override
    public void exibirListaVendas() {
            System.out.println("Vendas: ");
            for (Vendas venda : listaVendas) {
                    System.out.println(venda);
            }
    }

    @Override
    public void exibirListaFuncionarios() {
            System.out.println("Funcionarios: ");
            for (Funcionario funcionario : Funcionarios) {
                    System.out.println(funcionario);
            }
    }

    public String buscarClienteCodigo(int i) {
        for (Cliente cliente : Clientes) {
            if(cliente.getCodigoCliente() == i){
                return cliente.getNome();
            }
        }
        return "teste";
    }
    
    public Cliente buscarClienteCod(int i) {
        for (Cliente cliente : Clientes) {
            if(cliente.getCodigoCliente() == i){
                return cliente;
            }
        }
        return null;
    }
    
    public Cliente buscarClienteNome(String nome) {
        for (Cliente cliente : Clientes) {
            if(cliente.getNome().equals(nome)){
                return cliente;
            }
        }
        return null;
    }
}
