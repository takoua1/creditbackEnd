package com.banque.credit.type;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nom;
    @NotNull(message="remplir")
    private int nbrJour;
    @NotNull(message="remplir")
    private String description;
    @NotNull(message="remplir")
    private Boolean etat;
}
