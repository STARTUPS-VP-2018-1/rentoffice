/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.dominio;

import java.util.Objects;

/**
 *
 * @author internet
 */
public class Local {
    
    private String nomeLocal;
    private String proprietario;
    private String contrato;

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nomeLocal);
        hash = 89 * hash + Objects.hashCode(this.proprietario);
        hash = 89 * hash + Objects.hashCode(this.contrato);
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
        final Local other = (Local) obj;
        if (!Objects.equals(this.nomeLocal, other.nomeLocal)) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        return true;
    }

 

    
        
}
