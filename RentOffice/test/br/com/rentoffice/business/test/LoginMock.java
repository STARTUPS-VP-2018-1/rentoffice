/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.business.LocadorBusiness;
import br.com.rentoffice.business.LocatarioBusiness;
import br.com.rentoffice.business.LoginBusiness;
import br.com.rentoffice.business.interfaces.LocadorInterface;
import br.com.rentoffice.business.interfaces.LocatarioInterface;
import br.com.rentoffice.business.interfaces.LoginInterface;
import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class LoginMock {
    
    public static void main(String args[]){

 Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeUsuario("nome");
        novoUsuario.setSenha("senha");
        
        LoginInterface loginBusiness = new LoginBusiness();
         
        LocatarioInterface clienteBusiness = new LocatarioBusiness();
        LocadorInterface locadorBusiness = new LocadorBusiness();
        
        
        if(loginBusiness.validaUsuario(novoUsuario)){
            Locatario clienteEncontrado = clienteBusiness.
                    buscarClientePorUsuario(novoUsuario);            
            if(clienteEncontrado!=null){
            }
            if(locadorBusiness.buscarLocadorPorUsuario(novoUsuario)!=null){
        }else{
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
        }       
        }        
    }
}
