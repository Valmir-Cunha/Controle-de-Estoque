package entidades;


import servicos.Estoque;
import servicos.Administracao;

public class Administrador extends Funcionario {
    private Estoque estoque; 
    private Administracao gerencia;

    public Administrador() {
            super();
    }

    public Administrador(String nome, String endereco, String numeroTelefone, int id,double salario, Estoque estoque, Administracao gerencia) {
        super(nome, endereco, numeroTelefone, id, salario);
        this.estoque = estoque;
        this.gerencia = gerencia;
    }

    public void cadastrarCliente(int codigo,String nome,String numero,String endereco){
        Cliente cliente = new Cliente(nome,numero,endereco,codigo);
        gerencia.getClientes().add(cliente);
        gerencia.setIdClientes();   
    }

    public void excluirCliente() {

    }
}
