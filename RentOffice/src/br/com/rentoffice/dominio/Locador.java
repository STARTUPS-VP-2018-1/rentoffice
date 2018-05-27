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
public class Locador {
    
    private String rsocaill_LD;
    private Endereco endereco;
    private List<Integer> telefones;
    private List<String> emails;
    private String CNPJ;

    public String getRsocaill_LD() {
        return rsocaill_LD;
    }

    public void setRsocaill_LD(String rsocaill_LD) {
        this.rsocaill_LD = rsocaill_LD;
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
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.rsocaill_LD);
        hash = 59 * hash + Objects.hashCode(this.endereco);
        hash = 59 * hash + Objects.hashCode(this.telefones);
        hash = 59 * hash + Objects.hashCode(this.emails);
        hash = 59 * hash + Objects.hashCode(this.CNPJ);
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
        final Locador other = (Locador) obj;
        if (!Objects.equals(this.rsocaill_LD, other.rsocaill_LD)) {
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

 
