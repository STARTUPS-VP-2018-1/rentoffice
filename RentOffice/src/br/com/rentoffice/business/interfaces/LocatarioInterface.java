/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;

import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Usuario;

/**
 *
 * @author internet
 */
public interface LocatarioInterface {

    public Locatario salvarLocatario(Locatario cliente);

    public Locatario buscarClientePorUsuario(Usuario usuario);

}
