/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.test;

import br.com.rentoffice.business.LocadorBusiness;
import br.com.rentoffice.dominio.Endereco;
import br.com.rentoffice.dominio.Locador;

/**
 *
 * @author internet
 */
public class LocadorBusinessTest {
    
        public static void main(String[] args){
        LocadorBusiness lb = new LocadorBusiness();
        
        Locador lo = new Locador();
        lo.setRsocaill_LD("Bloodborne");
        lo.setCNPJ("4196019");
        
        try{
            lb.salvarLocador(lo);
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
    }
  }
}

