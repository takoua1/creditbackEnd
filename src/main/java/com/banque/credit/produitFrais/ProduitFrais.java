package com.banque.credit.produitFrais;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProduitFrais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message="remplir")
    private float montant;
    @NotNull(message="remplir")
    private Boolean etat;

}
