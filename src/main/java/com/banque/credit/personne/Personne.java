package com.banque.credit.personne;



import com.banque.credit.entreprise.Entreprise;
import com.banque.credit.groupe.Groupe;
import com.banque.credit.client.Client;
import com.banque.credit.profession.Profession;
import com.banque.credit.secteur.Secteur;
import com.banque.credit.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;


import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@Table(name = "personne")
public class Personne extends Client {

    @NotNull(message="remplir")
    private Integer cin;
    @NotNull(message="remplir")
   private String nom;
    @NotNull(message="remplir")
    private String prenom;
    @NotNull(message="remplir")
    private String sexe;
    @NotNull(message="remplir")

    private String naissance;
    @OneToOne(cascade = CascadeType.MERGE, targetEntity = Profession.class)
    private Profession profession;
    @OneToOne(cascade = CascadeType.MERGE, targetEntity = Secteur.class)

    private Secteur secteur;


    @OneToOne(cascade = CascadeType.MERGE, targetEntity = User.class)
    private User user;

    public Personne(String adresse, Integer tel, String mail, Integer cin, String nom, String prenom, String sexe, String naissance, Profession profession, Secteur secteur, User user) {
        super(adresse, tel, mail);
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.naissance = naissance;
        this.profession = profession;
        this.secteur = secteur;
        this.user = user;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNaissance() {
        return naissance;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public Profession  getProfession (){
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession =profession;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Personne()
{super();}
}
