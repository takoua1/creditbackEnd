package com.banque.credit.role;

import com.banque.credit.agence.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("SELECT a FROM Role a WHERE a.nom = :nom")
    Role findByName(@Param("nom")String nom);
    @Query("SELECT a FROM Role a WHERE a.etat = :etat ORDER BY nom")
    List<Role> getRoleByEtat(@Param("etat")boolean etat);


}
