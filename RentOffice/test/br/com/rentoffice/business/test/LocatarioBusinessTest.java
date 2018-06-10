/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.business.LocatarioBusiness;
import br.com.rentoffice.dominio.Endereco;
import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Usuario;
import br.com.rentoffice.repositorio.Repositorio;

/**
 *
 * @author internet
 */
public class LocatarioBusinessTest {
    
    public Locatario buscarClientePorUsuario(Usuario usuario) {
        for(Locatario cliente: Repositorio.locatarioDBFake){
            if(cliente.getNomeUsuario().equals(usuario.getNomeUsuario())){
                return cliente;
            }
        }       
        return null;
    }
    }
