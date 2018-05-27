/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.dominio;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author internet
 */
public class Locatario {
    

    private String rsocaill_LT; 
    private Endereco endereco;
    private List<Integer> telefones;
    private List<String> emails;
    private String CNPJ;   

    public String getRsocaill_LT() {
        return rsocaill_LT;
    }

    public void setRsocaill_LT(String rsocaill_LT) {
        this.rsocaill_LT = rsocaill_LT;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Integer> telefones) {
        this.telefones = telefones;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.rsocaill_LT);
        hash = 19 * hash + Objects.hashCode(this.endereco);
        hash = 19 * hash + Objects.hashCode(this.telefones);
        hash = 19 * hash + Objects.hashCode(this.emails);
        hash = 19 * hash + Objects.hashCode(this.CNPJ);
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
        final Locatario other = (Locatario) obj;
        if (!Objects.equals(this.rsocaill_LT, other.rsocaill_LT)) {
            return false;
        }
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefones, other.telefones)) {
            return false;
        }
        if (!Objects.equals(this.emails, other.emails)) {
            return false;
        }
        return true;
    }

   
    
}