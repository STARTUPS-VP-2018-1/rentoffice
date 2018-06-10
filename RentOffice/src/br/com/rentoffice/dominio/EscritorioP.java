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
public class EscritorioP {

    private String nomeEscritorioP;
    private Endereco enderecoEscritorioP;
    private String proprietarioEscritorioP;
    private String diariaEscritorioP;

    public String getNomeEscritorioP() {
        return nomeEscritorioP;
    }

    public void setNomeEscritorioP(String nomeEscritorioP) {
        this.nomeEscritorioP = nomeEscritorioP;
    }

    public Endereco getEnderecoEscritorioP() {
        return enderecoEscritorioP;
    }

    public void setEnderecoEscritorioP(Endereco enderecoEscritorioP) {
        this.enderecoEscritorioP = enderecoEscritorioP;
    }

    public String getProprietarioEscritorioP() {
        return proprietarioEscritorioP;
    }

    public void setProprietarioEscritorioP(String proprietarioEscritorioP) {
        this.proprietarioEscritorioP = proprietarioEscritorioP;
    }

    public String getDiariaEscritorioP() {
        return diariaEscritorioP;
    }

    public void setDiariaEscritorioP(String diariaEscritorioP) {
        this.diariaEscritorioP = diariaEscritorioP;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeEscritorioP);
        hash = 97 * hash + Objects.hashCode(this.enderecoEscritorioP);
        hash = 97 * hash + Objects.hashCode(this.proprietarioEscritorioP);
        hash = 97 * hash + Objects.hashCode(this.diariaEscritorioP);
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
        final EscritorioP other = (EscritorioP) obj;
        if (!Objects.equals(this.nomeEscritorioP, other.nomeEscritorioP)) {
            return false;
        }
        if (!Objects.equals(this.proprietarioEscritorioP, other.proprietarioEscritorioP)) {
            return false;
        }
        if (!Objects.equals(this.diariaEscritorioP, other.diariaEscritorioP)) {
            return false;
        }
        if (!Objects.equals(this.enderecoEscritorioP, other.enderecoEscritorioP)) {
            return false;
        }
        return true;
    }

}
