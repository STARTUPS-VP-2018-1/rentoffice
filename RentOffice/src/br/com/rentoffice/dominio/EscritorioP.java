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
public class EscritorioP extends Usuario {

    private String nomeEscritorioP;
    private String enderecoEscritorioP;
    private String proprietarioEscritorioP;
    private String diariaEscritorioP;
    private final String categoriaP = "Plus";

    public String getNomeEscritorioP() {
        return nomeEscritorioP;
    }

    public void setNomeEscritorioP(String nomeEscritorioP) {
        this.nomeEscritorioP = nomeEscritorioP;
    }

    public String getEnderecoEscritorioP() {
        return enderecoEscritorioP;
    }

    public void setEnderecoEscritorioP(String enderecoEscritorioP) {
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

    public String getCategoriaP() {
        return categoriaP;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.nomeEscritorioP);
        hash = 43 * hash + Objects.hashCode(this.enderecoEscritorioP);
        hash = 43 * hash + Objects.hashCode(this.proprietarioEscritorioP);
        hash = 43 * hash + Objects.hashCode(this.diariaEscritorioP);
        hash = 43 * hash + Objects.hashCode(this.categoriaP);
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
        if (!Objects.equals(this.categoriaP, other.categoriaP)) {
            return false;
        }
        if (!Objects.equals(this.enderecoEscritorioP, other.enderecoEscritorioP)) {
            return false;
        }
        return true;
    }

}
