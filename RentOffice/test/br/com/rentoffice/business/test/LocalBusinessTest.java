/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;


import br.com.rentoffice.business.EscritorioBBusinee;
import br.com.rentoffice.dominio.Endereco;
import br.com.rentoffice.dominio.EscritorioB;


/**
 *
 * @author internet
 */
public class LocalBusinessTest {
    
        public static void main(String[] args){
        EscritorioBBusinee lb = new EscritorioBBusinee();
        
        EscritorioB lo = new EscritorioB();
        lo.setNomeEscritorioB("Jerusalem");
        lo.setProprietarioEscritorioB("Jesus");
        lo.setDiariaEscritorioB("Vitalicio");
        
        Endereco end1 = new Endereco();
        end1.setCep(1234591449);
        end1.setBairro("Barrio 5");
        end1.setRua("Sim");
        end1.setNumero(4919);

        try{
            //lb.salvarLocal(lo);
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
    }
  }
}

