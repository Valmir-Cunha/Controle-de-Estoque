package aplicacao;

import java.io.IOException;

import banco.Arquivos;
import entidades.Categoria;
import entidades.GestorDeEstoque;
import entidades.Produto;
import servicos.Administracao;
import servicos.Estoque;

public class Programa {

	public static void main(String[] args) {
		Estoque estoqueMercado = new Estoque(); 
		Administracao admMercado = new Administracao();
		GestorDeEstoque gestor = new GestorDeEstoque("vinicius","rua123",9993242,1,"vinicius192","vinicius",900.0,estoqueMercado);
		Arquivos arq = new Arquivos(estoqueMercado, admMercado);
	}

}
