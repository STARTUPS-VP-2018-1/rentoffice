package br.com.rentoffice.dominio;

import br.com.rentoffice.business.LoginBusiness;
import br.com.rentoffice.business.interfaces.LoginInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author internet
 */
public class Login {
    
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

