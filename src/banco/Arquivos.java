package banco;

import entidades.Categoria;
import servicos.Caixa;
import java.io.File;
import java.io.FileOutputStream;
import entidades.Cliente;
import entidades.Funcionario;
import servicos.Administracao;
import servicos.Estoque;
import entidades.Produto;
import entidades.Vendas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;


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
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("Clientes.dat"),"UTF-8");
            for (Cliente cliente : administracao.getClientes()) {
                output.write(cliente.toString());
                output.flush();
            } 
    }

    public void registrarFuncionarios() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("Funcionarios.dat"),"UTF-8");
            for (Funcionario funcionario : administracao.getFuncionarios()) {
                output.write(funcionario.toString());
                output.flush();
            } 

    }

    public void registrarProdutos() throws FileNotFoundException, IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("Produtos.dat"),"UTF-8");
            for (Produto produto : estoque.getProdutosCadastrados()) {
                output.write(produto.toString());
                output.flush();
            }
    }
    public void registrarCategorias() throws FileNotFoundException, IOException{
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("Categorias.dat"),"UTF-8");
            for (Categoria categoria :estoque.getCategorias()) {
                output.write(categoria.toString());
                output.flush();
            } 
    }

    public void registrarProdutosExcluidos() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("ProdutosExcluidos.dat"),"UTF-8");
            for (Produto produto : estoque.getProdutosExcluidos()) {
                output.write(produto.toString());
                output.flush();
            } 
        

    }
    
    public void RegistrarVendas() throws FileNotFoundException,IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("TodasVendas.dat"),"UTF-8");
        for (Vendas venda : administracao.getListaVendas()) {
            output.write(venda.toString());
            output.flush();
            }   
    }
    public void RegistrarVendasProdutos() throws FileNotFoundException,IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("TodasVendasProdutos.dat"),"UTF-8");
        for (Vendas venda : administracao.getListaVendas()) {
            output.write(venda.toString2());
            output.flush();
            }   
    }

    public void carregarClientes() throws FileNotFoundException, IOException {
        File arquivo = new File("Clientes.dat");
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
        public void carregarVendas() throws FileNotFoundException, IOException {
        File arquivo = new File("TodasVendas.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String todoscientes;
            while (in.ready()) {
                Cliente cliente = new Cliente();
                Produto produto = new Produto();
                Vendas vend = new Vendas();
                todoscientes = in.readLine();
                String separartexto [] = todoscientes.split(";");
                cliente.setNome(separartexto[0]);
                vend.setCliente(cliente);
                vend.setId(Integer.parseInt(separartexto[1]));
                vend.setPrecoTotal(Double.parseDouble(separartexto[2]));
                administracao.getListaVendas().add(vend);
                    
                
         
            }
            }
    }
         public void carregaridProduto() throws FileNotFoundException, IOException {
            for (Produto produto :estoque.getProdutosCadastrados()) {
                estoque.setIdProdutos(); 
            }
            
    }
      public void carregaridCliente() throws FileNotFoundException, IOException { 
            for (Cliente cliente :administracao.getClientes()) {
                administracao.setIdClientes();
            }
            
    }
      public void carregaridCategoria() throws FileNotFoundException, IOException {
            for (Categoria categoria :estoque.getCategorias()) {
                estoque.setIdCategoria();
            }  
    }
      
    public void carregarIdVendas(){ 
        
    }
        

    public void carregarFuncionarios() throws FileNotFoundException, IOException {
        File arquivo = new File("Funcionarios.dat");
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

    public void carregarProdutos() throws FileNotFoundException, IOException {
        File arquivo = new File("Produtos.dat");
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
        File arquivo = new File("Categorias.dat");
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

    public void carregarProdutosExcluidos() throws FileNotFoundException, IOException {
        File arquivo = new File("ProdutosExcluidos.dat");
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
    public void carregarVendasProdutos() throws FileNotFoundException, IOException {
        File arquivo = new File("ProdutosExcluidos.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            while (in.ready()) {
                Produto produto = new Produto();
                Vendas venda = new Vendas();
                Categoria categoria = new Categoria();
                estoquetotal = in.readLine();
                String replace = estoquetotal.replace("[", "");
                String replace1 = estoquetotal.replace("]", "");
                String separartexto [] = estoquetotal.split(";");
                    produto.setNome(separartexto[0]);
                    produto.setCodigoProduto(Integer.parseInt(separartexto[1]));
                    produto.setMarca(separartexto[2]);
                    produto.setPreco(Double.parseDouble(separartexto[3]));
                    produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4]));
                    categoria.setNomeCategoria(separartexto[5]);
                    produto.setCategoria(categoria);
                    venda.getProdutos().add(produto);
                }
        }
    }
    public void carregarArquivos(){
        try {
            registrarCategorias();
            registrarProdutos();
            registrarClientes();
            registrarFuncionarios();
            registrarProdutosExcluidos();
            RegistrarVendas();
            RegistrarVendasProdutos();
        } catch(FileNotFoundException  ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados do sistema.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage()); 
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados do sistema.");
        }
    }
    
    public void preencherEstruturas() {
        try{
            carregarCategorias();
            carregarClientes();
            carregarProdutos();
            carregarProdutosExcluidos();
            carregaridProduto();
            carregaridCategoria();
            carregarVendas();
            carregarVendasProdutos();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do sistema.");
            //System.exit(0);
        }catch (IOException ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do sistema.");
        }
    }
}
