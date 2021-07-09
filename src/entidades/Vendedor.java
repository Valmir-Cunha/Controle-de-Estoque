package entidades;

import servicos.Caixa;

public class Vendedor extends Funcionario {
    private Caixa caixa = new Caixa();

    public Vendedor(String nome, String endereco, String numeroTelefone, int id, double salario) {
            super(nome, endereco, numeroTelefone, id, salario);
    }

    public void modificarSenha() {

    }


    public void adicionarProduto(Produto produto){
        caixa.getVenda().getProdutos().add(produto);
    }
}
