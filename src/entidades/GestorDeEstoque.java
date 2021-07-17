package entidades;

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

    public boolean editarProduto(int id, String nome, String marca, double preco, int quantidadeEstoque, Categoria categoria) {
        Produto produto = new Produto(id, nome, marca, preco, quantidadeEstoque, categoria);
        try{
            for (Produto produtoArray : estoque.getProdutosCadastrados()) {
                if(produtoArray.getCodigoProduto() == produto.getCodigoProduto()) {
                    produtoArray.setNome(produto.getNome());
                    produtoArray.setMarca(produto.getMarca());
                    produtoArray.setPreco(produto.getPreco());
                    produtoArray.setQuantidadeEstoque(produto.getQuantidadeEstoque());
                    if(!produto.getCategoria().equals(produtoArray.getCategoria())){
                        trocarCategoriaProduto(produtoArray, produto.getCategoria().getNomeCategoria());
                    }
                    return true;
                }
            }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }


    public boolean excluirProdutos(Produto produto) {
        try{
            for (Produto produtoArray : estoque.getProdutosCadastrados()) {
                if(produtoArray.equals(produto)) {
                    excluirProdutoCategoria(produto.getCategoria(), produto);
                    estoque.getProdutosCadastrados().remove(produto);
                    estoque.getProdutosExcluidos().add(produto);
                    return true;
                }
            }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    //Nao mexer
    public boolean buscarCategoriaid(int id) {
        try{
            for (Categoria categoria: estoque.getCategorias()) {
                if(categoria.getCodigoCategoria()== id) {
                        return true;
                }
            }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    //Nao mexer
    public boolean cadastrarCategoria(int id,String nome) {
        if(!buscarCategoriaid(id)){
            Categoria categoria = new Categoria(nome,id);
            try{
                estoque.getCategorias().add(categoria);
            }catch(NullPointerException ex){
                System.out.println(ex.getMessage());
            }
            return true;
        }else{
            return false;
        }

    }
    //Nao mexer
    public Categoria buscarCategoria(int id) {
        try{
            for (Categoria categoria: estoque.getCategorias()) {
                if(categoria.getCodigoCategoria()== id) {
                        return categoria;
                }
            }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    //Nao mexer
    public boolean excluirCategoria(int i) {
        Categoria categoria = buscarCategoria(i);
        if(categoria != null){
            if(categoria.getProdutos().isEmpty()){
            estoque.getCategorias().remove(categoria);
            return true;
            }else{
                for(Produto produto: categoria.getProdutos()){
                    produto.setCategoria(buscarCategoria(1));
                    adicionarProdutoCategoria(buscarCategoria(1),produto);
                }
                estoque.getCategorias().remove(categoria);
                return true;
            }
        }else{
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
        try{
            categoria.getProdutos().add(produto);
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
    /*
    * Trocar a categoria de um produto.
    *Acessa o produto e pega a categoria antiga e exclui o produto dessa categoria. Após, busca
    *a nova categoria, atribui ela ao produto e cadastra o produto na lista dela
    */
    public void trocarCategoriaProduto(Produto produto, String categoriaNova){
        //Removendo produto da lista de produtos da categoria 
        Categoria categoria = produto.getCategoria();
        categoria.getProdutos().remove(produto);
        //Buscando nova categoria e cadastrando o produto nela
        categoria = estoque.encontrarCategoriaNome(categoriaNova);
        produto.setCategoria(categoria);
        categoria.getProdutos().add(produto);
    }
    
    public void excluirProdutoCategoria(Categoria categoria,Produto produto){
        if(categoria.getProdutos().contains(produto)){
            categoria.getProdutos().remove(produto);
        }
    }
}
