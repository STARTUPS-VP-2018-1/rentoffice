/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.interfaces;

import br.com.rentoffice.dominio.EscritorioP;
import java.util.List;

/**
 *
 * @author schor
 */
public interface EscritorioPInterface {

    public EscritorioP salvarEscritorioP(EscritorioP escritoriobs);

    public List<EscritorioP> buscarTodosEscritoriosP();
}
