package com.banque.credit.type_garanties;


import com.banque.credit.garanties.Garanties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class TypeGaranties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)

    private String nom;

    @NotNull(message="remplir")
    private Boolean etat;
    public TypeGaranties() {
    }

    public TypeGaranties(String nom) {
        this.nom = nom;
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

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
