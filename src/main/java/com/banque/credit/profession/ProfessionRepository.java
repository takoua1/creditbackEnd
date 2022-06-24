package com.banque.credit.profession;

import com.banque.credit.secteur.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessionRepository extends JpaRepository<Profession,Long> {

    @Query("SELECT a FROM Profession a WHERE a.nom = :nom")
    Profession findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Profession a WHERE a.etat = :etat ORDER BY nom")
    List<Profession> getProfessionByEtat(@Param("etat")boolean etat);
}
