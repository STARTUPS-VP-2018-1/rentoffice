/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.repositorio;

import br.com.rentoffice.dominio.Locatario;
import br.com.rentoffice.dominio.Locador;
import br.com.rentoffice.dominio.EscritorioB;
import br.com.rentoffice.dominio.EscritorioD;
import br.com.rentoffice.dominio.EscritorioP;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {

    public static List<EscritorioB> escritorioBDFake = new ArrayList<EscritorioB>();
    public static List<EscritorioD> escritorioDFake = new ArrayList<EscritorioD>();
    public static List<EscritorioP> escritorioPDFake = new ArrayList<EscritorioP>();
    public static List<Locatario> locatarioDBFake = new ArrayList<Locatario>();
    public static List<Locador> locadorDBFake = new ArrayList<Locador>();

    static {
        Locador lo = new Locador();
        lo.setNomeUsuario("Locador");
        lo.setSenha("123");
        lo.setCNPJ("4196019");
        Repositorio.locadorDBFake.add(lo);
    }

    static {
        Locatario lo = new Locatario();
        lo.setNomeUsuario("Locatario");
        lo.setSenha("123");
        lo.setCNPJ("4196019");
        Repositorio.locatarioDBFake.add(lo);

        EscritorioB lo2 = new EscritorioB();
        lo2.setNomeEscritorioB("Escritorio TEST");
        lo2.setProprietarioEscritorioB("Bruno");
        lo2.setDiariaEscritorioB("R$14,44");
        Repositorio.escritorioBDFake.add(lo2);
        
        EscritorioD lo3 = new EscritorioD();
        lo3.setNomeEscritorioD("Escritorio 2");
        lo3.setProprietarioEscritorioD("Bruno");
        lo3.setDiariaEscritorioD("R$14,44");
        Repositorio.escritorioDFake.add(lo3);
        
        EscritorioD lo4 = new EscritorioD();
        lo4.setNomeEscritorioD("Escritorio TEST");
        lo4.setProprietarioEscritorioD("Bruno");
        lo4.setDiariaEscritorioD("R$14,44");
        lo4.setEnderecoEscritorioD("Rua Jabiaçu");
        
        Repositorio.escritorioDFake.add(lo4);
    }

}
