/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;

import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Locatario;

/**
 *
 * @author internet
 */
public interface LoginInterface {
    

    public boolean logarUsuario(String nomeUsuario, String senhaUsuario);
    
    public Locador logarLocadorUsuario(String nomeUsuario, String senhaUsuario);
    
     public Locatario logarLocatario(String nomeUsuario, String senhaUsuario);
}
