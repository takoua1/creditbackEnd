package com.banque.credit.type_garanties;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypeGarantiesRepository  extends JpaRepository<TypeGaranties, Long> {

    @Query("SELECT a FROM TypeGaranties a WHERE a.nom = :nom")
    TypeGaranties findByName(@Param("nom")String nom);
    @Query("SELECT a FROM TypeGaranties a WHERE a.etat = :etat ORDER BY nom")
    List<TypeGaranties> getTypeGarantiesByEtat(@Param("etat")boolean etat);
}
