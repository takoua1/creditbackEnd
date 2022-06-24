package com.banque.credit.typePlanification;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class TypePlanification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nom;
    @NotNull(message="remplir")
    private Boolean etat;

}
