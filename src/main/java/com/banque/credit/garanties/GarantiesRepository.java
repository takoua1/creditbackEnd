package com.banque.credit.garanties;

import com.banque.credit.agence.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GarantiesRepository  extends JpaRepository<Garanties, Long> {

    @Query("SELECT a FROM Garanties a WHERE a.nom = :nom")
    Garanties findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Garanties a WHERE a.etat = :etat ORDER BY nom")
    List<Garanties> getGarantiesByEtat(@Param("etat")boolean etat);

}
