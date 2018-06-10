/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;
import br.com.rentoffice.dominio.Escritorio;
import java.util.List;

public interface EscritorioInterface {
    
    public Escritorio salvarLocal(Escritorio produto);
    
    public List<Escritorio> buscarLocalPorNome(String nome);
    
    public List<Escritorio> buscarTodosLocais();
    
}
