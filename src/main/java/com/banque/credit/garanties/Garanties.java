package com.banque.credit.garanties;


import com.banque.credit.type_garanties.TypeGaranties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Garanties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)

    private String nom;
    @NotNull(message="remplir")
    private double montant;
    @OneToOne(cascade = CascadeType.MERGE,targetEntity = TypeGaranties.class)

    private TypeGaranties typeGaranties;


    @NotNull(message="remplir")
    private Boolean etat;

    public Garanties() {
    }

    public Garanties(String nom, double montant ,TypeGaranties typeGaranties) {

        this.nom = nom;
        this.montant = montant;
        this.typeGaranties= typeGaranties;
        this.etat= true;
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

    public double getMontant() {
        return montant;
    }

    public void setMontant( double montant) {
        this.montant = montant;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public TypeGaranties getTypeGaranties() {
        return typeGaranties;
    }

    public void setTypeGaranties(TypeGaranties typeGaranties) {
        this.typeGaranties = typeGaranties;
    }
}
