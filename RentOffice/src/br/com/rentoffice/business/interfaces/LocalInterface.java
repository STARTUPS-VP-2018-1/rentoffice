/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;
import br.com.rentoffice.dominio.Local;
import java.util.List;

public interface LocalInterface {
    
    public Local salvarLocal(Local produto);
    
    public List<Local> buscarLocalPorNome(String nome);
    
    public List<Local> buscarTodosLocais();
    
}
