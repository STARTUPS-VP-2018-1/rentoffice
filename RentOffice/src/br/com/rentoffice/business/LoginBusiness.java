/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.business.interfaces.LoginInterface;
import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Usuario;
import br.com.rentoffice.repositorio.Repositorio;


/**
 *
 * @author internet
 */
public class LoginBusiness implements LoginInterface{

    public Locador logarLocadorUsuario(String nomeUsuario, String senhaUsuario) {
       Locador locadorRetorno=null;
        
        for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getNomeLD().equals(nomeUsuario)){
               locadorRetorno = locador; 
            }
        }     
          return  locadorRetorno; 

    }

    public Locatario logarLocatario(String nomeUsuario, String senhaUsuario) {
         Locatario locatarioRetorno=null;
        
        for(Locatario locatario: Repositorio.locatarioDBFake){
            if(locatario.getNomeLT().equals(nomeUsuario)){
               locatarioRetorno = locatario; 
            }
        }     
          return  locatarioRetorno; 
    }

    public Locatario logarUsuario(String nomeUsuario, String senhaUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        Usuario usuario = null;
        
        for(Locatario locador: Repositorio.locatarioDBFake){
            if(locador.getNomeUsuario().
                    equals(nomeUsuario)&&
                 locador.getSenha().equals(senha)){
                   usuario = new Usuario();   
                   usuario.setNomeUsuario(nomeUsuario);
                   usuario.setSenha(senha);
                   usuario.setLocador(false);
                }
            }
            for(Locador fornecedor:Repositorio.locadorDBFake){
                if(fornecedor.getNomeUsuario().
                        equals(nomeUsuario)&&
                  fornecedor.getSenha().equals(senha)){
                   usuario = new Usuario();   
                   usuario.setNomeUsuario(nomeUsuario);
                   usuario.setSenha(senha);
                   usuario.setLocador(true);
                }
            }
            return null;
    }

  }
    
         
    

