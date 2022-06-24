package com.banque.credit.agence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface AgenceRepository  extends JpaRepository <Agence, Long>{
    @Query("SELECT a FROM Agence a WHERE a.nom = :nom")
    Agence findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Agence a WHERE a.etat = :etat ORDER BY nom")
    List<Agence> getAgenceByEtat(@Param("etat")boolean etat);
    @Query("SELECT a FROM Agence a WHERE a.code = :code")
    Agence findByCode(@Param("code")String code);

}
