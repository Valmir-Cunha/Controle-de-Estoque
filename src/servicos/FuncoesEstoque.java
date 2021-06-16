package servicos;

import java.util.List;
import entidades.Produto;

public interface FuncoesEstoque {
	
	public List<Produto> produtosCadasrados();
	public List<Produto> produtosDisponiveis();
	public List<Produto> produtosIndisponiveis();
	public List<Produto> produtosExcluidos();
	
	

}
