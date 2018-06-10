/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.dominio;

import java.util.Objects;

/**
 *
 * @author schor
 */
public class EscritorioD {

    private String nomeEscritorioD;
    private Endereco enderecoEscritorioD;
    private String proprietarioEscritorioD;
    private String diariaEscritorioD;

    public String getNomeEscritorioD() {
        return nomeEscritorioD;
    }

    public void setNomeEscritorioD(String nomeEscritorioD) {
        this.nomeEscritorioD = nomeEscritorioD;
    }

    public Endereco getEnderecoEscritorioD() {
        return enderecoEscritorioD;
    }

    public void setEnderecoEscritorioD(Endereco enderecoEscritorioD) {
        this.enderecoEscritorioD = enderecoEscritorioD;
    }

    public String getProprietarioEscritorioD() {
        return proprietarioEscritorioD;
    }

    public void setProprietarioEscritorioD(String proprietarioEscritorioD) {
        this.proprietarioEscritorioD = proprietarioEscritorioD;
    }

    public String getDiariaEscritorioD() {
        return diariaEscritorioD;
    }

    public void setDiariaEscritorioD(String diariaEscritorioD) {
        this.diariaEscritorioD = diariaEscritorioD;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nomeEscritorioD);
        hash = 83 * hash + Objects.hashCode(this.enderecoEscritorioD);
        hash = 83 * hash + Objects.hashCode(this.proprietarioEscritorioD);
        hash = 83 * hash + Objects.hashCode(this.diariaEscritorioD);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EscritorioD other = (EscritorioD) obj;
        if (!Objects.equals(this.nomeEscritorioD, other.nomeEscritorioD)) {
            return false;
        }
        if (!Objects.equals(this.proprietarioEscritorioD, other.proprietarioEscritorioD)) {
            return false;
        }
        if (!Objects.equals(this.diariaEscritorioD, other.diariaEscritorioD)) {
            return false;
        }
        if (!Objects.equals(this.enderecoEscritorioD, other.enderecoEscritorioD)) {
            return false;
        }
        return true;
    }

}
