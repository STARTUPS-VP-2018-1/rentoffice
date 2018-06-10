/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.dominio.Locador;
import java.util.List;
import br.com.rentoffice.business.interfaces.LocadorInterface;
import br.com.rentoffice.dominio.Usuario;
import br.com.rentoffice.repositorio.Repositorio;

public class LocadorBusiness implements LocadorInterface {

    @Override
    public Locador salvarLocador(Locador fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Locador buscarLocadoresPorCNPJ(String CNPJ) {
            for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getCNPJ() == CNPJ){
                return locador;
            }
        } 
        return null;
    }

    public List<Locador> buscarLocadoresPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Locador> buscarTodosLocadores() {
        return Repositorio.locadorDBFake;
    }

   

    public List<Locador> buscarTodosLocador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public boolean validarLocatario(Locador locador){
        boolean valido=true;
        
        if(locador!=null){
            if((locador.getNomeLD()!=null &&
                    !locador.getNomeLD().equals(""))&&
                    (locador.getCNPJ()!= null &&
                    !locador.getCNPJ().equals(""))&&
                    (locador.getEndereco()!=null)){
                      valido=true;
                
            }
        }
        
        return valido;
    }

   
    @Override
    public Locador buscarLocadorPorUsuario(Usuario usuario) {
        for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getNomeUsuario().equals(usuario.getNomeUsuario())){
               return locador; 
            }                      
        }
        return null;  
    }

    @Override
    public List<Locador> buscarLocadorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
