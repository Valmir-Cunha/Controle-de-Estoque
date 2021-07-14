package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import servicos.Estoque;

public class GestorDeEstoque extends Funcionario {
    private Estoque estoque; 

    public GestorDeEstoque(String nome, String endereco, String numeroTelefone, int id,double salario, Estoque estoque) {
        super(nome, endereco, numeroTelefone, id, salario);
        this.estoque = estoque;
    }

    public Estoque getEstoque() {
            return estoque;
    }

    public boolean cadastrarProdutos(Produto produto) {
        if(produto != null){
            estoque.getProdutosCadastrados().add(produto);
            return true;
        }
        else{
            return false;
        }
    }

    public void editarProduto(Produto produto) {
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
            //produto.setCategoria(buscarCategoria(entrada.nextLine()));
            }
        }
        entrada.close();
    }


    public void excluirProdutos(Produto produto) {
        for (Produto produtoArray : estoque.getProdutosCadastrados()) {
            if(produtoArray.equals(produto)) {
                estoque.getProdutosCadastrados().remove(produto);
                estoque.getProdutosExcluidos().add(produto);
            }
        }
    }
    
    public boolean excluirProduto(int id) {
        Produto produto;
        produto = estoque.encontrarProdutoCod(id);
        estoque.getProdutosCadastrados().remove(produto);
        estoque.getProdutosExcluidos().add(produto);
        return true;
    }
    
    
    //Nao mexer
    public boolean buscarCategoria(int id,String nome) {
        for (Categoria categoria: estoque.getCategorias()) {
            if(categoria.getCodigoCategoria()== id) {
                    return true;
            }
        }
        return false;
    }
    //Nao mexer
    public boolean cadastrarCategoria(int id,String nome) {
        if(!buscarCategoria(id, nome)){
            Categoria categoria = new Categoria(nome,id);
            estoque.getCategorias().add(categoria);
            return true;
        }else{
            return false;
        }
        
    }
    //Nao mexer
    public Categoria buscarCategoria(int id) {
        for (Categoria categoria: estoque.getCategorias()) {
            if(categoria.getCodigoCategoria()== id) {
                    return categoria;
            }
        }
        return null;
    }
    //Nao mexer
    public boolean excluirCategoria(int i) {
        Categoria categoria = buscarCategoria(i);
        
        if(categoria != null) {
            estoque.getCategorias().remove(categoria);
            return true;
        }else {
            return false;
        }
    }
    //Nao mexer
    public boolean editarCategoria(int id, String nome){
        Categoria categoria;
        categoria = buscarCategoria(id);
        if(categoria != null){
            categoria.setNomeCategoria(nome);
            return true;
        }else{
            return false;
        }
    }
      
    public void adicionarProdutoCategoria(Categoria categoria, Produto produto){
        categoria.getProdutos().add(produto);
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
