package com.banque.credit.produit;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nom;
    @NotNull(message="remplir")
    private String dispo;
    @NotNull(message="remplir")
    private double taux;
    @NotNull(message="remplir")
    private double montant;
    @NotNull(message="remplir")
    private int echancie;
    @NotNull(message="remplir")
    private int periodeGrace;

    @NotNull(message="remplir")
    private Boolean etat;

    public Produit() {
    }

    public Produit(String nom, String dispo,double taux, double montant,int echancie, int periodeGrace) {
        this.nom = nom;
        this.dispo = dispo;
        this.taux = taux;
        this.montant= montant;
        this.echancie = echancie;
        this.periodeGrace = periodeGrace;
        this.etat=true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getEchancie() {
        return echancie;
    }

    public void setEchancie(int echancie) {
        this.echancie = echancie;
    }

    public int getPeriodeGrace() {
        return periodeGrace;
    }

    public void setPeriodeGrace(int periodeGrace) {
        this.periodeGrace = periodeGrace;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
