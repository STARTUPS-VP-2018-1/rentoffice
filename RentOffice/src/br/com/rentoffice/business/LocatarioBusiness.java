/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.business.interfaces.LocatarioInterface;
import br.com.rentoffice.dominio.Usuario;
import br.com.rentoffice.repositorio.Repositorio;


public class LocatarioBusiness implements LocatarioInterface{

    @Override
    public Locatario salvarLocatario(Locatario cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Locatario buscarClientePorUsuario(Usuario usuario) {
        for(Locatario cliente: Repositorio.locatarioDBFake){
            if(cliente.getNomeUsuario().equals(usuario.getNomeUsuario())){
                return cliente;
            }
        }       
        return null;
    }
    }
       
   

    
