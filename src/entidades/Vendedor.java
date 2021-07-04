package entidades;

import servicos.Caixa;

public class Vendedor extends Funcionario {
    private Caixa caixa = new Caixa();

    public Vendedor(String nome, String endereco, long numeroTelefone, int id, String login, String senha, double salario) {
            super(nome, endereco, numeroTelefone, id, login, senha, salario);
    }

    public void modificarSenha() {

    }


    public void adicionarProduto(Produto produto){
        caixa.getVenda().getProdutos().add(produto);
    }
}
