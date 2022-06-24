package com.banque.credit.garants;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GarantsRepository extends JpaRepository<Garants,Long> {

    @Query("SELECT a FROM Garants a WHERE a.nom = :nom")
    Garants findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Garants a WHERE a.etat = :etat ORDER BY nom")
    List<Garants> getGarantsByEtat(@Param("etat")boolean etat);
}
