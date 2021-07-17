package aplicacao;

import banco.Arquivos;
import entidades.Administrador;
import entidades.GestorDeEstoque;
import formularios.jMenu;
import java.io.IOException;
import servicos.Administracao;
import servicos.Estoque;
import servicos.Caixa;

public class Programa {

    public static void main(String[] args) throws IOException {
        Estoque estoqueMercado = new Estoque(); 
        Administracao admMercado = new Administracao();
        Caixa caixa = new Caixa();
        Administrador adm = new Administrador(estoqueMercado, admMercado);
        Arquivos arq = new Arquivos(estoqueMercado, admMercado, caixa);
        GestorDeEstoque gestor = new GestorDeEstoque("Valmir", "Avenida 1", "99321312", admMercado.getIdFuncionarios(), 0, estoqueMercado);
        jMenu menu = new jMenu(admMercado,estoqueMercado,gestor,adm,arq);
        menu.setVisible(true);
        //arq.preencherEstruturas();
    }
}
