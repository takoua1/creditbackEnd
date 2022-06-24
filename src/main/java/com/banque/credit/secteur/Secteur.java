package com.banque.credit.secteur;


import com.banque.credit.personne.Personne;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "secteur")
public class Secteur {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(unique = true, nullable = false)

  private String nom;

  @NotNull(message="remplir")
  private Boolean etat;

  public Secteur(String nom) {
    this.nom = nom;

    this.etat= true;
  }

  public Secteur() {
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
