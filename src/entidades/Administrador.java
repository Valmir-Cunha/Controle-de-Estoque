package entidades;


import servicos.Estoque;
import servicos.Administracao;

public class Administrador extends Funcionario implements FuncoesAdministrador{
    private Estoque estoque; 
    private Administracao gerencia;

    public Administrador(Estoque estoque, Administracao gerencia) {
        super();
        this.estoque = estoque;
        this.gerencia = gerencia;
    }

    //Não mexer
    public Administrador(String nome, String endereco, String numeroTelefone, int id,double salario, Estoque estoque, Administracao gerencia) {
        super(nome, endereco, numeroTelefone, id, salario);
        this.estoque = estoque;
        this.gerencia = gerencia;
    }
    
    //Não mexer
    @Override
    public void cadastrarCliente(int id,String nome,String numero,String endereco){
        Cliente cliente = new Cliente(nome,numero,endereco,id);
        try{
            gerencia.getClientes().add(cliente);
            gerencia.setIdClientes();   
        }catch(NullPointerException ex){
            System.out.print(ex.getMessage());
        }
        
    }
    
    //Não mexer
    @Override
    public boolean excluirCliente(int id) {
        Cliente cliente;
        cliente = gerencia.buscarClienteCod(id);
        try{
            gerencia.getClientes().remove(cliente);
            gerencia.getClientesExcluidos().add(cliente);
        }catch(NullPointerException ex){
            System.out.print(ex.getMessage());
        }
        return true;
    }
    
    //Não mexer
    @Override
    public boolean editarCliente(int id,String nome,String numero,String endereco){
        Cliente cliente;
        cliente = gerencia.buscarClienteCod(id);
        if(cliente != null){
            cliente.setNome(nome);
            cliente.setNumeroTelefone(numero);
            cliente.setEndereco(endereco);
            return true;
        }else{
            return false;
        }
    }
    
    public Vendas buscarVenda(int id){
        try{
            for(Vendas venda: gerencia.getListaVendas()){
                if(venda.getId() == id){
                    return venda;
                }
            }
        }catch(NullPointerException ex){
            System.out.print(ex.getMessage());
        }
        return null;
    }
}
