package com.banque.credit.role;

import com.banque.credit.profession.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/roles")
public class RoleController {
   @Autowired
    RoleRepository roleRepository;
    @PostMapping("/add")
    public Role addRole(@Valid @RequestBody Role role)
    {
     return (roleRepository.save(role));
    }

 @GetMapping(value="/getByName/{nom}")
 public Role findByName(@Valid @RequestParam String nom){

  return roleRepository.findByName(nom);
 }
}
