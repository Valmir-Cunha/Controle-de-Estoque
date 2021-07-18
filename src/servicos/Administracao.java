package servicos;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Vendas;

public class Administracao{
    private int idClientes = 1;
    private int idFuncionarios = 1;
    private int idVendas = 1;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Cliente> clientesExcluidos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Vendas> listaVendas = new ArrayList<>();
    
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
            return clientes;
    }

    public List<Cliente> getClientesExcluidos() {
            return clientesExcluidos;
    }

    public List<Funcionario> getFuncionarios() {
            return funcionarios;
    }
    public List<Vendas> getListaVendas() {
            return listaVendas;
    }
}
