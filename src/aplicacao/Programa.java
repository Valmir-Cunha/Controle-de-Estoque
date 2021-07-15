package aplicacao;

import banco.Arquivos;
import entidades.Administrador;
import entidades.GestorDeEstoque;
import formularios.jMenu;
import java.io.IOException;
import servicos.Administracao;
import servicos.Estoque;
import entidades.Categoria;

public class Programa {

    public static void main(String[] args) throws IOException {
        Estoque estoqueMercado = new Estoque(); 
        Administracao admMercado = new Administracao();
        Administrador adm = new Administrador(estoqueMercado, admMercado);
        Arquivos arq = new Arquivos(estoqueMercado, admMercado);
        GestorDeEstoque gestor = new GestorDeEstoque("Valmir", "Avenida 1", "99321312", admMercado.getIdFuncionarios(), 0, estoqueMercado);
        jMenu menu = new jMenu(admMercado,estoqueMercado,gestor,adm,arq);
        menu.setVisible(true);
        arq.carregarClientes();
        arq.carregarProdutos();
        arq.carregarFuncionarios();
        arq.carregarCategorias();
    }
}
