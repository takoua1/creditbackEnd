package com.banque.credit.user;


import com.banque.credit.role.Role;
import com.banque.credit.role.RoleRepository;
import com.banque.credit.type_garanties.TypeGaranties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @PostMapping("/add")
    public User addUser(@Valid @RequestBody User user)
    {





        return (userRepository.save(user));
    }
    @GetMapping(value="/getByLogin/{login}")
    public User findByLogin(@Valid @RequestParam String login){

        return userRepository.findByLogin(login);
    }
}
