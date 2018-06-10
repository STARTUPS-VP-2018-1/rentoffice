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
public class EscritorioB {
    
    private String nomeEscritorioB;
    private Endereco enderecoEscritorioB;
    private String proprietarioEscritorioB;
    private String diariaEscritorioB;

    public String getNomeEscritorioB() {
        return nomeEscritorioB;
    }

    public void setNomeEscritorioB(String nomeEscritorioB) {
        this.nomeEscritorioB = nomeEscritorioB;
    }

    public Endereco getEnderecoEscritorioB() {
        return enderecoEscritorioB;
    }

    public void setEnderecoEscritorioB(Endereco enderecoEscritorioB) {
        this.enderecoEscritorioB = enderecoEscritorioB;
    }

    public String getProprietarioEscritorioB() {
        return proprietarioEscritorioB;
    }

    public void setProprietarioEscritorioB(String proprietarioEscritorioB) {
        this.proprietarioEscritorioB = proprietarioEscritorioB;
    }

    public String getDiariaEscritorioB() {
        return diariaEscritorioB;
    }

    public void setDiariaEscritorioB(String diariaEscritorioB) {
        this.diariaEscritorioB = diariaEscritorioB;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nomeEscritorioB);
        hash = 17 * hash + Objects.hashCode(this.enderecoEscritorioB);
        hash = 17 * hash + Objects.hashCode(this.proprietarioEscritorioB);
        hash = 17 * hash + Objects.hashCode(this.diariaEscritorioB);
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
        final EscritorioB other = (EscritorioB) obj;
        if (!Objects.equals(this.nomeEscritorioB, other.nomeEscritorioB)) {
            return false;
        }
        if (!Objects.equals(this.proprietarioEscritorioB, other.proprietarioEscritorioB)) {
            return false;
        }
        if (!Objects.equals(this.diariaEscritorioB, other.diariaEscritorioB)) {
            return false;
        }
        if (!Objects.equals(this.enderecoEscritorioB, other.enderecoEscritorioB)) {
            return false;
        }
        return true;
    }
    
    
}
