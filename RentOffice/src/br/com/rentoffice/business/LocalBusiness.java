/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.dominio.Local;
import br.com.rentoffice.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;
import br.com.rentoffice.business.interfaces.LocalInterface;

/**
 *
 * @author internet
 */
public class LocalBusiness implements LocalInterface{

    @Override
    public Local salvarLocal(Local local) {
        Repositorio.localDBFake.add(local);
        return local;
    }

    @Override
    public List<Local> buscarLocalPorNome(String nome) {           
        List<Local> listaDeLocaisEncontrados = new ArrayList<Local>();        
        
        for(int i = 0; i< Repositorio.localDBFake.size();i++){
            Local produto = Repositorio.localDBFake.get(i);
            if(produto.getNomeLocal().startsWith(nome)){
                listaDeLocaisEncontrados.add(produto);
            }           
        }
        return listaDeLocaisEncontrados;
    }

    public List<Local> buscarTodosLocais() {
      return Repositorio.localDBFake;  
    }

    public Local buscarLocaisPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Local> buscarLocaisPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Local> buscarTodosLocal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public boolean validarLocal(Local local){
        boolean valido=true;
        
        if(local!=null){
            if((local.getNomeLocal()!=null &&
                    !local.getNomeLocal().equals(""))&&
                    (local.getContrato()!= null &&
                    !local.getContrato().equals(""))&&
                    (local.getProprietario()!=null)){
                      valido=true;
                
            }
        }
        
        return valido;
    }
}
