package com.banque.credit.agence;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)

    private String nom;
    @NotNull(message="remplir")
    private String adresse;
    @Column(unique = true, nullable = false)
    private String code;
    @NotNull(message="remplir")
    private String description;

    private Boolean etat;

    public Agence() {
    }

    public Agence(String nom, String adresse, String code, String description) {
        this.nom = nom;
        this.adresse = adresse;
        this.code = code;
        this.description = description;

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
