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

     
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        Usuario usuario = null;
        
        for(Locatario locatario: Repositorio.locatarioDBFake){
            if(locatario.getNomeUsuario().
                    equals(nomeUsuario) &&
               locatario.getSenha().equals(senha)){
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setLocador(false);
                        
            }   
        }        
        for(Locador locador:Repositorio.locadorDBFake){
            if(locador.getNomeUsuario().
                    equals(nomeUsuario) &&
                locador.getSenha().equals(senha)){
                
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setLocador(true);                
            }
        }        
        return usuario;
    }

    @Override
    public boolean validaUsuario(Usuario usuario) {
       
        
        for(Locatario locatario: Repositorio.locatarioDBFake){
            if(locatario.getNomeUsuario().
                    equals(usuario.getNomeUsuario()) &&
               locatario.getSenha().equals(locatario.getSenha())){
                return true;
            }   
        }
        
        for(Locador locador:Repositorio.locadorDBFake){
            if(locador.getNomeUsuario().
                    equals(usuario.getNomeUsuario()) &&
                locador.getSenha().equals(usuario.getSenha())){
                return true;
            }
        }        
        return false;
    }

    }
    

    
         
    

