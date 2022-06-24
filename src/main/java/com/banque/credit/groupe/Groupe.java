package com.banque.credit.groupe;

import com.banque.credit.client.Client;
import com.banque.credit.personne.Personne;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Groupe extends Client {


    private String nom;
;

    public Groupe(String nom) {
  this.nom =nom;

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }




}
