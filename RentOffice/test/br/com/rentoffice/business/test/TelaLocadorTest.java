/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.dominio.EscritorioB;
import br.com.rentoffice.dominio.EscritorioD;
import br.com.rentoffice.dominio.EscritorioP;
import br.com.rentoffice.repositorio.Repositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class TelaLocadorTest {
    
     
        EscritorioD novoLocal new = EscritorioD();
        lo.setNomeEscritorioB("Prudente");
        lo.setDiariaEscritorioB("99,99");

        EscritorioD novoLocalD = new EscritorioD();
      
        novoLocalD.setNomeEscritorioD("Paulista");
        novoLocalD.setDiariaEscritorioD("R$99,00");

        EscritorioP novoLocalP = new EscritorioP();
        novoLocalP.setNomeEscritorioP("Ema");
        novoLocalP.setDiariaEscritorioP("15,00");

        if (NomeEscritorioP == null || DiariaEscritorioP == null) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos !");
        } else {

            if (txtCategoria.getSelectedItem().equals("Básico")) {

                Repositorio.escritorioBDFake.add(novoLocalB);
                txtLocalEs.setText("");
                txtDiaria.setText("");
            }

            if (txtCategoria.getSelectedItem().equals("Padrão")) {

                Repositorio.escritorioDFake.add(novoLocalD);
                txtLocalEs.setText("");
                txtDiaria.setText("");
            }

            if (txtCategoria.getSelectedItem().equals("Plus")) {

                Repositorio.escritorioPDFake.add(novoLocalP);
                txtLocalEs.setText("");
                txtDiaria.setText("");
            }
            JOptionPane.showMessageDialog(null, "Escritório cadastrado com sucesso");
        }
    }                         

