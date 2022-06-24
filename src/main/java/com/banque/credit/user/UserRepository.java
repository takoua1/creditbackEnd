package com.banque.credit.user;



import com.banque.credit.type_garanties.TypeGaranties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT a FROM User a WHERE a.login = :login")
    User findByLogin(@Param("login")String login);
    @Query("SELECT a FROM User a WHERE a.etat = :etat ORDER BY login")
    List<User> getUserByEtat(@Param("etat")boolean etat);

}
