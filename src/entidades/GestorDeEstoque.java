package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicos.Estoque;

public class GestorDeEstoque extends Funcionario {
    private Estoque estoque; 
    //private List<Produto> produtos = new ArrayList<>();

    public GestorDeEstoque(String nome, String endereco, String numeroTelefone, int id, String login, String senha,double salario, Estoque estoque) {
        super(nome, endereco, numeroTelefone, id, login, senha, salario);
        this.estoque = estoque;
    }

    public Estoque getEstoque() {
            return estoque;
    }

    public String cadastrarProdutos() {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();
        String categoria;
        System.out.println("Por favor, digite os dados do produto a seguir!");
        System.out.println("Codigo: ");
        produto.setCodigoProduto(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Nome: ");
        produto.setNome(entrada.nextLine());
        System.out.println("Marca: ");
        produto.setMarca(entrada.nextLine());
        System.out.println("Preco: ");
        produto.setPreco(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Quantidade: ");
        produto.setQuantidadeEstoque(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Digite o nome da categoria: ");
        categoria = entrada.nextLine();
        produto.setCategoria(buscarCategoria(categoria));
        for (Produto produtoArray : estoque.getProdutosCadastrados()) {
            if(produtoArray.getCodigoProduto() == produto.getCodigoProduto()) {
                System.out.println("Um produto de mesmo codigo ja esta cadastrado, "
                                + "nao eh possivel ter dois produto de mesmo codigo");
            }
        }
        estoque.getProdutosCadastrados().add(produto);
        entrada.close();
    }

    public void alterarProduto(Produto produto) {
        Scanner entrada = new Scanner(System.in);
        for (Produto produtoArray : estoque.getProdutosCadastrados()) {
            if(produtoArray.equals(produto)) {
                    System.out.println("Por favor, digite os dados do produto a seguir!");
            System.out.println("Codigo: ");
            produto.setCodigoProduto(entrada.nextInt());
            System.out.println("Nome: ");
            produto.setNome(entrada.nextLine());
            entrada.next();
            System.out.println("Marca: ");
            produto.setMarca(entrada.nextLine());
            entrada.next();
            System.out.println("Preco: ");
            produto.setPreco(entrada.nextDouble());
            System.out.println("Quantidade: ");
            produto.setQuantidadeEstoque(entrada.nextInt());
            System.out.println("Digite o nome da categoria: ");
            produto.setCategoria(buscarCategoria(entrada.nextLine()));
            }
        }
        entrada.close();
    }


    public void excluirProdutos(Produto produto) {
        for (Produto produtoArray : estoque.getProdutosCadastrados()) {
            if(produtoArray.equals(produto)) {
                estoque.getProdutosCadastrados().remove(produto);
                estoque.getProdutosExcluidos().add(produto);
                System.out.println("Produto excluido");
            }
        }
    }

    public Categoria buscarCategoria(String nome) {
        for (Categoria categoria: estoque.getCategorias()) {
            if(categoria.getNomeCategoria().equals(nome)) {
                    return categoria;
            }
        }
        return cadastrarCategoria(nome);
    }

    public Categoria cadastrarCategoria(String nome) {
        Categoria categoria = new Categoria(nome,9999); //id temporario
        estoque.getCategorias().add(categoria);
        return categoria;
    }

    public void excluirCategoria(Categoria categoria) {
        if(estoque.getCategorias().remove(categoria)) {
                System.out.println("Categoria excluida");
        }else {
                System.out.println("Categoria nao existe/ nao encontrada");
        }
    }
    public void salvar() throws FileNotFoundException, IOException{
        try (FileOutputStream f = new FileOutputStream(new File("\\dados\\Produtos.txt"),true)) {
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(estoque.getProdutosCadastrados().toString());
            o.close();
        }
    }
    public void CarregarArquivoEstoque() throws IOException{
        File arquivo = new File("Produtos.tx");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                estoquetotal = in.readLine();
                //estoque.getProdutosCadastrados().add(estoquetotal); 
            }
        }
    }

}
