package com.banque.credit.personne;


import com.banque.credit.client.ClientReppository;
import com.banque.credit.role.Role;
import com.banque.credit.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.banque.credit.role.*;
import javax.validation.Valid;

@RestController
@RequestMapping(path = "/personne")
public class PersonneController {

    @Autowired
    PersonneRepository personneRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    ClientReppository clientReppository;
    @PostMapping("/add")
    public Personne addPersonne(@Valid @RequestBody Personne personne)
    {





      /*  Long n = Long.valueOf(53);
        Role role = roleRepository.findById(n).orElse(null);
        personne.getUser().addRoles(role);
         userRepository.save(personne.getUser());*/






        return (personneRepository.save(personne));
    }
}
