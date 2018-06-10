/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.dominio.Escritorio;
import br.com.rentoffice.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;
import br.com.rentoffice.business.interfaces.EscritorioInterface;

/**
 *
 * @author internet
 */
public class EscritorioBusiness implements EscritorioInterface{

    @Override
    public Escritorio salvarLocal(Escritorio local) {
        Repositorio.escritorioEcoDBFake.add(local);
        return local;
    }

    @Override
    public List<Escritorio> buscarLocalPorNome(String nome) {           
        List<Escritorio> listaDeLocaisEncontrados = new ArrayList<Escritorio>();        
        
        for(int i = 0; i< Repositorio.escritorioEcoDBFake.size();i++){
            Escritorio produto = Repositorio.escritorioEcoDBFake.get(i);
            if(produto.getNomeLocal().startsWith(nome)){
                listaDeLocaisEncontrados.add(produto);
            }           
        }
        return listaDeLocaisEncontrados;
    }

    public List<Escritorio> buscarTodosLocais() {
       return Repositorio.escritorioEcoDBFake;

    }

    public Escritorio buscarLocaisPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Escritorio> buscarLocaisPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Escritorio> buscarTodosLocal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public boolean validarLocal(Escritorio local){
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
