/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public interface FuncoesAdministrador {
    
    void cadastrarCliente(int id,String nome,String numero,String endereco);
    boolean excluirCliente(int id);    
    boolean editarCliente(int id,String nome,String numero,String endereco);
}
