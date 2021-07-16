package servicos;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;
import entidades.Funcionario;



public class Administracao implements FuncoesAdministracao{
    private int idClientes = 1;
    private int idFuncionarios = 1;
    private int idVendas = 1;
    private List<Cliente> Clientes = new ArrayList<>();
    private List<Cliente> ClientesExcluidos = new ArrayList<>();
    private List<Funcionario> Funcionarios = new ArrayList<>();

    public Administracao() {
    }

    public Administracao(int c, int f) {
        idClientes = c;
    }
    
    
    public int getIdClientes() {
            return idClientes;
    }
    
    public void setIdClientes() {
            idClientes++;
    }

    public int getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(int idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public int getIdVendas() {
            return idVendas;
    }
    
    public void setIdVendas() {
            idVendas++;
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
    public void exibirListaFuncionarios() {
            System.out.println("Funcionarios: ");
            for (Funcionario funcionario : Funcionarios) {
                System.out.println(funcionario);
            }
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
