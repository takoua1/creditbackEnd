package com.banque.credit.profession;

import com.banque.credit.personne.Personne;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "profession")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)

    private String nom;
    @OneToOne(mappedBy = "profession")
    private Personne individu;
    @NotNull(message="remplir")
    private Boolean etat;

    public Profession() {
    }

    public Profession(String nom) {
        this.nom = nom;
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

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
