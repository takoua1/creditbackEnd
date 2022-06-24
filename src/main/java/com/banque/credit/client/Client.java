package com.banque.credit.client;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class Client {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message="remplir")
   private  String adresse;
    @NotNull(message="remplir")
   private Integer Tel;
    @Email
    @NotNull(message="remplir")
   private  String mail;
    @NotNull(message="remplir")


    public Client() {

    }

    public Client(String adresse, Integer tel, String mail) {

        this.adresse = adresse;
        Tel = tel;
        this.mail = mail;


    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTel() {
        return Tel;
    }

    public void setTel(Integer tel) {
        Tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
