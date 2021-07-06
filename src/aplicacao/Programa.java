package aplicacao;

import banco.Arquivos;
import entidades.Categoria;
import entidades.GestorDeEstoque;
import entidades.Produto;
import entidades.Vendedor;
import formularios.JLogin;
import formularios.jMenu;
import servicos.Administracao;
import servicos.Estoque;

public class Programa {

    public static void main(String[] args) {
        Estoque estoqueMercado = new Estoque(); 
        Administracao admMercado = new Administracao();
        Arquivos arq = new Arquivos(estoqueMercado, admMercado);
        //JLogin login = new JLogin(admMercado);
        //login.setVisible(true);
        jMenu menu = new jMenu(admMercado,estoqueMercado);
        menu.setVisible(true);
        /*GestorDeEstoque gestor = new GestorDeEstoque("vinicius","rua123",9993242,1,"vinicius192","vinicius",900.0,estoqueMercado);
        //Categoria c = new Categoria("sfg",1);
        //Produto pp = new Produto(1,"biscoitto","bno",2.5,5,c);
        //System.out.println(pp.toString());
        gestor.cadastrarProdutos();
        System.out.println("Www");
        gestor.getEstoque().exibirProdutosCadastrados();
        Vendedor vinicius = new Vendedor("vinicius","rua1",79991343,123,"vinii","senha",34567.0);
        */
    }
}
