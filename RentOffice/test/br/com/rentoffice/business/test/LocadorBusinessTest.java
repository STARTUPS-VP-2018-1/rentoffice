/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.business.LocadorBusiness;
import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Usuario;
import br.com.rentoffice.repositorio.Repositorio;

/**
 *
 * @author internet
 */
public class LocadorBusinessTest {
    
    public Locador buscarLocadorPorUsuario(Usuario usuario) {
        for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getNomeUsuario().equals(usuario.getNomeUsuario())){
               return locador; 
            }                      
        }
        return null;  
    }
}
