package com.banque.credit.secteur;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecteurRepository extends JpaRepository<Secteur, Long> {
    @Query("SELECT a FROM Secteur a WHERE a.nom = :nom")
    Secteur findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Secteur a WHERE a.etat = :etat ORDER BY nom")
    List<Secteur> getSecteurByEtat(@Param("etat")boolean etat);
}
