/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.business.LoginBusiness;
import br.com.rentoffice.business.interfaces.LoginInterface;

/**
 *
 * @author internet
 */
public class LoginMock {
    
    public static void main(String args[]){
     String nomeUsuario = "Bruno";        
        String senhaUsuario = "123";
        
        LoginInterface loginBusiness = new LoginBusiness();
        
        if(loginBusiness.logarUsuario(nomeUsuario, senhaUsuario)){
            System.out.println("Usuario Autenticado");
        }else{
            System.err.println("Usuario Inexistente");
        }
    }   

}
