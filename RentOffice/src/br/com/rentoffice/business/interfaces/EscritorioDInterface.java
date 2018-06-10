/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;

import br.com.rentoffice.dominio.EscritorioD;
import java.util.List;

/**
 *
 * @author schor
 */
public interface EscritorioDInterface {

    public EscritorioD salvarEscritorioD(EscritorioD escritoriobs);

    public List<EscritorioD> buscarTodosEscritoriosD();
}
