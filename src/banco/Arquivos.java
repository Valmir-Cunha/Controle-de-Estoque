package banco;

import entidades.Categoria;
import entidades.Vendas;
import servicos.Caixa;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import entidades.Cliente;
import entidades.Funcionario;
import servicos.Administracao;
import servicos.Estoque;
import entidades.Produto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Arquivos {
    Estoque estoque;
    Administracao administracao;
    Caixa caixa;

    public Arquivos(Estoque estoque,Administracao administracao, Caixa caixa) {
        this.estoque = estoque;
        this.administracao = administracao;
        this.caixa = caixa;
    }

    public void registrarClientes() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Clientes.dat"),"UTF-8");
            for (Cliente cliente : administracao.getClientes()) {
                output.write(cliente.toString());
                output.flush();
            } 
    }

    public void registrarFuncionarios() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Funcionarios.dat"),"UTF-8");
            for (Funcionario funcionario : administracao.getFuncionarios()) {
                output.write(funcionario.toString());
                output.flush();
            } 

    }

    public void registrarVendas() throws IOException {

    }

    public void registrarProdutos() throws FileNotFoundException, IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Produtos.dat"),"UTF-8");
            for (Funcionario funcionario : administracao.getFuncionarios()) {
                output.write(funcionario.toString());
                output.flush();
            }
    }
    public void registrarCategorias() throws FileNotFoundException, IOException{
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Categorias.dat"),"UTF-8");
            for (Funcionario funcionario : administracao.getFuncionarios()) {
                output.write(funcionario.toString());
                output.flush();
            } 

    }

    public void registrarProdutosIndisponiveis() {

    }

    public void registrarProdutosExcluidos() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\ProdutosExcluidos.dat"),"UTF-8");
            for (Funcionario funcionario : administracao.getFuncionarios()) {
                output.write(funcionario.toString());
                output.flush();
            } 
        

    }

    public void carregarClientes() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\Clientes.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String todoscientes;
            while (in.ready()) {
                Cliente cliente = new Cliente();
                todoscientes = in.readLine();
                String separartexto [] = todoscientes.split(";");
                cliente.setNome(separartexto[0]);
                cliente.setEndereco(separartexto[1]);
                cliente.setNumeroTelefone(separartexto[2]);
                cliente.setCodigoCliente(Integer.parseInt(separartexto[3]));
                    administracao.getClientes().add(cliente);
                    
                
                
            }
            }
    }

    public void carregarFuncionarios() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\Funcionarios.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String todosfuncionarios;
            while (in.ready()) {
                Funcionario funcionarios = new Funcionario();
                todosfuncionarios = in.readLine();
                String separartexto [] = todosfuncionarios.split(";");
                funcionarios.setEndereco(separartexto[0]);
                funcionarios.setNome(separartexto[1]);
                funcionarios.setNumeroTelefone(separartexto[2]);
                administracao.getFuncionarios().add(funcionarios);
                    
                
                
            }
            }

    }

    public void carregarVendas() {

    }

    public void carregarProdutos() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\Produtos.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                Produto produto = new Produto();
                Categoria categoria = new Categoria();
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                    produto.setNome(separartexto[0]);
                    produto.setCodigoProduto(Integer.parseInt(separartexto[1]));
                    produto.setMarca(separartexto[2]);
                    produto.setPreco(Double.parseDouble(separartexto[3]));
                    produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4]));
                    categoria.setNomeCategoria(separartexto[5]);
                    produto.setCategoria(categoria);
                    estoque.getProdutosCadastrados().add(produto);
                    
                }
                
            
        }
    }
        public void carregarCategorias() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\Categorias.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                Categoria categoria = new Categoria();
                Produto produto = new Produto();
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                categoria.setNomeCategoria(separartexto[0]);
                categoria.setCodigoCategoria(Integer.parseInt(separartexto[1]));
                produto.setCategoria(categoria);
                    estoque.getCategorias().add(categoria);
                    
                }
                
            
        }
    }

    public void carregarProdutosIndisponiveis() throws FileNotFoundException, IOException {
                File arquivo = new File("dados\\ProdutosIndisponiveis.dat");
                try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
                    String estoquetotal;
                    while (in.ready()) {
                Produto produto = new Produto();
                Categoria categoria = new Categoria();
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                    produto.setNome(separartexto[0]);
                    produto.setCodigoProduto(Integer.parseInt(separartexto[1]));
                    produto.setMarca(separartexto[2]);
                    produto.setPreco(Double.parseDouble(separartexto[3]));
                    produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4]));
                    categoria.setNomeCategoria(separartexto[5]);
                    produto.setCategoria(categoria);
                    estoque.getProdutosIndisponiveis().add(produto);
                    
                }
                }
    }

    public void carregarProdutosExcluidos() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\ProdutosExcluidos.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                Produto produto = new Produto();
                Categoria categoria = new Categoria();
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                    produto.setNome(separartexto[0]);
                    produto.setCodigoProduto(Integer.parseInt(separartexto[1]));
                    produto.setMarca(separartexto[2]);
                    produto.setPreco(Double.parseDouble(separartexto[3]));
                    produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4]));
                    categoria.setNomeCategoria(separartexto[5]);
                    produto.setCategoria(categoria);
                    estoque.getProdutosExcluidos().add(produto);
                    
                }
                }

    }
    
    public void carregarArquivos(){
        
    }
    
    public void preencherEstruturas(){
        
    }
}
