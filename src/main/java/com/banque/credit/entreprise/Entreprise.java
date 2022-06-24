package com.banque.credit.entreprise;

import com.banque.credit.personne.Personne;
import com.banque.credit.client.Client;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Entreprise extends Client {

    @NotNull(message="remplir")
    private String raison_sociale;
    @NotNull(message="remplir")
    private String mf;
    @NotNull(message="remplir")
    private String rg;
    @NotNull(message="remplir")
    private Float tva;
    @NotNull(message="remplir")
    private String statut;
    @NotNull(message="remplir")
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "individu_id", referencedColumnName = "id")
    private Personne personne;

    public Entreprise(String adresse, Integer tel, String mail,  String raison_sociale, String mf, String rg, Float tva, String statut, Personne personne) {

        super(adresse, tel, mail);
        this.raison_sociale = raison_sociale;
        this.mf = mf;
        this.rg = rg;
        this.tva = tva;
        this.statut = statut;
        this.personne = personne;
    }

    public String getRaison_sociale() {
        return raison_sociale;
    }

    public void setRaison_sociale(String raison_sociale) {
        this.raison_sociale = raison_sociale;
    }

    public String getMf() {
        return mf;
    }

    public void setMf(String mf) {
        this.mf = mf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Entreprise(){ super();}
}
