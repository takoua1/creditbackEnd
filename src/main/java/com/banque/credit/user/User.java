package com.banque.credit.user;


import com.banque.credit.personne.Personne;
import com.banque.credit.role.Role;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
   private String login;
    @NotNull(message="remplir")
    private String password;
    @NotNull(message="remplir")
    private Boolean etat;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role",
    joinColumns =@JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Role> roles =new ArrayList<Role>() ;


    public User() {
    }

    public User(String login, String password) {

        this.login = login;
        this.password = password;
        this.etat=true;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }



    public void addRoles(Role role){

        this.roles.add(role);
    }


    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
