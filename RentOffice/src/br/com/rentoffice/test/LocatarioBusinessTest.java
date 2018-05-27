/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.test;

import br.com.rentoffice.business.LocatarioBusiness;
import br.com.rentoffice.dominio.Endereco;
import br.com.rentoffice.dominio.Locatario;
import java.util.ArrayList;

/**
 *
 * @author internet
 */
public class LocatarioBusinessTest {
    
    public static void main(String[] args){
        LocatarioBusiness lb = new LocatarioBusiness();
        
        Locatario lo = new Locatario();
        lo.setRsocaill_LT("Juninho ");
        
        //Bem Vindo ao Mundo de Juninho
        Endereco end1 = new Endereco();
        end1.setCep(1234591449);
        end1.setBairro("Cidade de Deus");
        end1.setCidade("Morumbi");
        end1.setEstado("Corinthias");
        end1.setComplemento("Casa sobre a agua");
        end1.setRua("Rua Juninho da Se");
        
        lo.setTelefones(new ArrayList<Integer>());
        lo.getTelefones().add(94941449);
        lo.getTelefones().add(66666666);
        
        
        try{
            lb.salvarLocatario(lo);
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
    }
  }
}
