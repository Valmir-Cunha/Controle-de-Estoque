package aplicacao;

import java.io.IOException;

import entidades.Categoria;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//GestorDeEstoque gestor = new GestorDeEstoque("vinicius","rua123",9993242,"vinicius192","vinicius",900.0,1);
		Categoria categoria = new Categoria("Biscoitos recheado",1);
		Produto biscoito = new Produto(1,"Biscoito recheado","Vitarella",2.5,15,categoria);
		//gestor.cadastrarProdutos(biscoito);
		System.out.print("Feito");
	}

}
