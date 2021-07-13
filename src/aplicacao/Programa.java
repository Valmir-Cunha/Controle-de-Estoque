package aplicacao;

import banco.Arquivos;
import entidades.Administrador;
import entidades.GestorDeEstoque;
import formularios.jMenu;
import servicos.Administracao;
import servicos.Estoque;

public class Programa {

    public static void main(String[] args) {
        Estoque estoqueMercado = new Estoque(); 
        Administracao admMercado = new Administracao();
        Administrador adm = new Administrador(estoqueMercado, admMercado);
        Arquivos arq = new Arquivos(estoqueMercado, admMercado);
        GestorDeEstoque gestor = new GestorDeEstoque("Valmir", "Avenida 1", "99321312", admMercado.getIdFuncionarios(), 0, estoqueMercado);
        jMenu menu = new jMenu(admMercado,estoqueMercado,gestor,adm);
        menu.setVisible(true);
    }
}
