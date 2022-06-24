package com.banque.credit.produit;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @Query("SELECT a FROM Produit a WHERE a.nom = :nom")
    Produit findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Produit a WHERE a.etat = :etat ORDER BY nom")
    List<Produit> getProduitByEtat(@Param("etat")boolean etat);
}
