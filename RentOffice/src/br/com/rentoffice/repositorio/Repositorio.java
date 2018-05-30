/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.repositorio;

import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.Local;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<Local> localDBFake = new ArrayList<Local>();
    public static List<Locatario> locatarioDBFake = new ArrayList<Locatario>();
    public static List<Locador> locadorDBFake = new ArrayList<Locador>();
    
    
    static{        
        Locador lo = new Locador();
        lo.setRsocaill_LD("Locador");
        lo.setCNPJ("4196019");
        Repositorio.locadorDBFake.add(lo);
    }
    static{        
        Locatario lo = new Locatario();
        lo.setRsocaill_LT("Locatario");
        lo.setCNPJ("4196019");
        Repositorio.locatarioDBFake.add(lo);
    }
    
    
}
