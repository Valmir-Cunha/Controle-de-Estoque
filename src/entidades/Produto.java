package entidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Produto {
	private int codigoProduto;
	private String nome;
	private String marca;
	private double preco;
	private int quantidadeEstoque;
	private Categoria categoria;

	public Produto(int codigoProduto, String nome, String marca, double preco, int quantidadeEstoque,
			Categoria categoria) {
		super();
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
        public String cadastrarProduto() throws IOException{
            Scanner inteiro = new Scanner(System.in);
            String nome;
            System.out.println("Qual nome do produto?");
            nome = inteiro.next();
            File fw = new File (nome+(".txt"));
            if (fw.exists()) {
                System.out.println("O produto já está cadastrado");
                
            } else {

            PrintWriter pw = new PrintWriter(fw);
            pw.println("Codigo: "+this.codigoProduto);
            pw.println("Nome: "+this.nome);
            pw.println("Marca: "+this.marca);
            pw.println("Preço: "+this.preco);
            pw.println("Quantidade: "+this.quantidadeEstoque);
            pw.println("Categoria: "+this.categoria);
            pw.println("----------------");
            pw.flush();
            pw.close();
            return null;
        }
        return null;
        }
}
