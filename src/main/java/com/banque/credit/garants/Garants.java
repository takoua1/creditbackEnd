package com.banque.credit.garants;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Garants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)

    private String nom;
    @NotNull(message="remplir")
    private String relation;
    @NotNull(message="remplir")
    private double montant;
    @NotNull(message="remplir")
    private String description;
    @NotNull(message="remplir")
    private boolean etat;

    public Garants() {
    }

    public Garants(String nom, String relation, double montant, String description) {
        this.nom = nom;
        this.relation = relation;
        this.montant = montant;
        this.description = description;
        this.etat = true;
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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
