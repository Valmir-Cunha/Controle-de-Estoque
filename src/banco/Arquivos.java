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
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
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

    public void registrarProdutos() throws FileNotFoundException, IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Produtos.dat"),"UTF-8");
            for (Produto produto : estoque.getProdutosCadastrados()) {
                output.write(produto.toString());
                output.flush();
            }
    }
    public void registrarCategorias() throws FileNotFoundException, IOException{
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\Categorias.dat"),"UTF-8");
            for (Categoria categoria :estoque.getCategorias()) {
                output.write(categoria.toString());
                output.flush();
            } 
    }

    public void registrarProdutosExcluidos() throws FileNotFoundException, IOException {
            OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\ProdutosExcluidos.dat"),"UTF-8");
            for (Produto produto : estoque.getProdutosExcluidos()) {
                output.write(produto.toString());
                output.flush();
            } 
        

    }
    
    public void registrarVendas() throws FileNotFoundException,IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\TodasVendas.dat"),"UTF-8");
        for (Vendas venda : administracao.getListaVendas()) {
            output.write(venda.toString());
            output.flush();
            }   
    }
    public void registrarVendasProdutos() throws FileNotFoundException,IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\TodasVendasProdutos.dat"),"UTF-8");
        for (Vendas venda : administracao.getListaVendas()) {
            output.write(venda.toString2());
            output.flush();
            }   
    }
    
    public void registrarProdutosCategoria() throws FileNotFoundException, IOException{
        OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream("dados\\ProdutosCategorias.dat"),"UTF-8");
        for (Categoria categoria : estoque.getCategorias()) {
            output.write(categoria.toString2());
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
        public void carregarVendas() throws FileNotFoundException, IOException {
        File arquivo = new File("dados\\TodasVendas.dat");
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
         public void carregaridProduto() throws FileNotFoundException, IOException, NullPointerException {
            for (Produto produto :estoque.getProdutosCadastrados()) {
                estoque.setIdProdutos(); 
            }
            
    }
         public void carregaridVendas() throws FileNotFoundException, IOException, NullPointerException {
            for (Vendas venda :administracao.getListaVendas()) {
                administracao.setIdVendas(); 
            }
            
    }
      public void carregaridCliente() throws FileNotFoundException, IOException, NullPointerException { 
            for (Cliente cliente :administracao.getClientes()) {
                administracao.setIdClientes();
            }
            
    }
      public void carregaridCategoria() throws FileNotFoundException, IOException {
            for (Categoria categoria :estoque.getCategorias()) {
                estoque.setIdCategoria();
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
    public void carregarVendasProdutos() throws FileNotFoundException, IOException, NullPointerException, ArrayIndexOutOfBoundsException {
        File arquivo = new File("dados\\TodasVendasProdutos.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            int max = administracao.getListaVendas().size();
            int indice = 0;
            while (in.ready()) {
                Produto produto = new Produto();
                List<Vendas> vendas;
                vendas = administracao.getListaVendas();
                Categoria categoria;
                estoquetotal = in.readLine();
                String separartexto [] = estoquetotal.split(";");
                produto.setNome(separartexto[0].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim());
                produto.setCodigoProduto(Integer.parseInt(separartexto[1].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim()));
                produto.setMarca(separartexto[2].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim());
                produto.setPreco(Double.parseDouble(separartexto[3].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim()));
                produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim()));
                String nome = separartexto[5].replace("[", "").replace("[]", "").replace(",", "").trim();
                if(nome.contains("]")){
                    categoria = estoque.encontrarCategoriaNome(nome.replace("]", ""));                
                    produto.setCategoria(categoria);
                    vendas.get(indice).getProdutos().add(produto);
                    indice++;
                }else{
                    categoria = estoque.encontrarCategoriaNome(separartexto[5].replace("[", "").replace("[]", "").replace(",", ""));
                    produto.setCategoria(categoria);
                    vendas.get(indice).getProdutos().add(produto);
                }
            }
        }
    }
    
    public void carregarProdutosCategoria() throws FileNotFoundException, IOException,NullPointerException, ArrayIndexOutOfBoundsException{
        File arquivo = new File("dados\\ProdutosCategorias.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(arquivo))) {
            String estoquetotal;
            int max = estoque.getCategorias().size();
            int indice = 0;
            while (in.ready() && indice < max) {
                Produto produto = new Produto();
                List<Categoria> categorias;
                categorias = estoque.getCategorias();
                Categoria categoria;
                estoquetotal = in.readLine();
                String separartexto[] = estoquetotal.split(";");
                produto.setNome(separartexto[0].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim());
                produto.setCodigoProduto(Integer.parseInt(separartexto[1].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").replace(" ", "").trim()));
                produto.setMarca(separartexto[2].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim());
                produto.setPreco(Double.parseDouble(separartexto[3].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim()));
                produto.setQuantidadeEstoque(Integer.parseInt(separartexto[4].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim()));
                String nome = separartexto[5].replace("[", "").replace("]", "").replace("[]", "").replace(",", "").trim();
                if(nome.contains("]")){
                    categoria = estoque.encontrarCategoriaNome(nome.replace("]", ""));
                    produto.setCategoria(categoria);
                    categorias.get(indice).getProdutos().add(produto);
                    indice++;
                }else{
                    categoria = estoque.encontrarCategoriaNome(nome.replace("]", ""));
                    produto.setCategoria(categoria);
                    categorias.get(indice).getProdutos().add(produto);
                }
            }
        }
    }
    
    public void carregarArquivos(){
        try {
            registrarCategorias();
            registrarProdutos();
            registrarClientes();
            registrarProdutosCategoria();
            registrarFuncionarios();
            registrarProdutosExcluidos();
            registrarVendas();
            registrarVendasProdutos();
        } catch(FileNotFoundException  ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Arquivos nao encontrados.");
        } catch(ArrayIndexOutOfBoundsException ex){
            ex.getMessage();
        }catch (IOException | NullPointerException ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do sistema.");
        }
    }
    
    public void preencherEstruturas() {
        try{
            carregarCategorias();
            carregarClientes();
            carregaridCliente();
            carregarProdutos();
            carregarProdutosExcluidos();
            carregaridProduto();
            carregaridCategoria();
            carregarVendas();
            carregaridVendas();
            carregarProdutosCategoria();
            carregarVendasProdutos();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Arquivos nao encontrados.");
        } catch(ArrayIndexOutOfBoundsException ex){
            ex.getMessage();
        } catch (IOException | NullPointerException ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do sistema.");
        } 
    }
}
