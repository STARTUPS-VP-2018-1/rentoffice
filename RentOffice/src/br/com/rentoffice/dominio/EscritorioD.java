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
public class EscritorioD extends Usuario {

    private String nomeEscritorioD;
    private String enderecoEscritorioD;
    private String proprietarioEscritorioD;
    private String diariaEscritorioD;
    private final String categoriaD = "Padrão";

    public String getNomeEscritorioD() {
        return nomeEscritorioD;
    }

    public void setNomeEscritorioD(String nomeEscritorioD) {
        this.nomeEscritorioD = nomeEscritorioD;
    }

    public String getEnderecoEscritorioD() {
        return enderecoEscritorioD;
    }

    public void setEnderecoEscritorioD(String enderecoEscritorioD) {
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

    public String getCategoriaD() {
        return categoriaD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nomeEscritorioD);
        hash = 53 * hash + Objects.hashCode(this.enderecoEscritorioD);
        hash = 53 * hash + Objects.hashCode(this.proprietarioEscritorioD);
        hash = 53 * hash + Objects.hashCode(this.diariaEscritorioD);
        hash = 53 * hash + Objects.hashCode(this.categoriaD);
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
        if (!Objects.equals(this.categoriaD, other.categoriaD)) {
            return false;
        }
        if (!Objects.equals(this.enderecoEscritorioD, other.enderecoEscritorioD)) {
            return false;
        }
        return true;
    }

}
