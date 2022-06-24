package com.banque.credit.frais;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Frais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
     private String nom;
    @Column(unique = true, nullable = false)
    private String compteFacturation;
    @Column(unique = true, nullable = false)
    private String compteRevenu;
    @Column(unique = true, nullable = false)
    private String compteDepenses;
    @NotNull(message="remplir")
    private String description;
    @NotNull(message="remplir")
    private Boolean etat;
}
