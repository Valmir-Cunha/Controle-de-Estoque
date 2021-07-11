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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

    public void registrarProdutos() throws FileNotFoundException, IOException{
        try (FileOutputStream f = new FileOutputStream(new File("\\dados\\Produtos.txt"),true)) {
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(estoque.getProdutosCadastrados().toString());
            o.close();
        }

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

    public void carregarProdutos() throws FileNotFoundException, IOException {
        List<Produto> produtosCadastrados = new ArrayList<>();
        File arquivo = new File("Produtos.txt");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                for (int posicao = 0; posicao < 6; posicao++){
                    estoque.getProdutosCadastrados().add(separartexto[posicao]);
                }
                
            }
        }
    }

    public void carregarProdutosIndisponiveis() {

    }

    public void carregarProdutosExcluidos() {

    }
}
