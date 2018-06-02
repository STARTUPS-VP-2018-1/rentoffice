/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.business.interfaces.LoginInterface;
import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.repositorio.Repositorio;
import br.com.rentoffice.tela.frmLocador;
import br.com.rentoffice.tela.frmEscritorios;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class LoginBusiness implements LoginInterface{

    @Override
    public Locador logarLocadorUsuario(String nomeUsuario, String senhaUsuario) {
       Locador locadorRetorno=null;
        
        for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getRsocaill_LD().equals(nomeUsuario)){
               locadorRetorno = locador; 
            }
        }     
          return  locadorRetorno; 

    }

    @Override
    public Locatario logarLocatario(String nomeUsuario, String senhaUsuario) {
         Locatario locatarioRetorno=null;
        
        for(Locatario locatario: Repositorio.locatarioDBFake){
            if(locatario.getRsocaill_LT().equals(nomeUsuario)){
               locatarioRetorno = locatario; 
            }
        }     
          return  locatarioRetorno; 
    }

    }
    
         
    

