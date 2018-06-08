/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;

import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Usuario;
import java.util.List;

/**
 *
 * @author internet
 */
public interface LocadorInterface {
    
    public Locador salvarLocador(Locador fornecedor);
    
    public List<Locador> buscarLocadorPorNome(String nome);
    
    public List<Locador> buscarTodosLocadores();
    
     public Locador buscarLocadorPorUsuario(Usuario usuario);
}
