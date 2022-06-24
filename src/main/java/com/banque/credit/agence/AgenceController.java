package com.banque.credit.agence;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/agence")
public class AgenceController {
    @Autowired
     AgenceRepository agenceRepository;
    @PostMapping("/add")
     public Agence addAgence(@Valid @RequestBody Agence agence){


         return agenceRepository.save(agence);
     }
     @GetMapping(value="/getByName/{nom}")
    public Agence findByName(@Valid @RequestParam String nom){

        return agenceRepository.findByName(nom);
     }
    @GetMapping(value="/getByCode/{code}")
    public Agence findByCode(@Valid @RequestParam String code){

        return agenceRepository.findByCode(code);
    }
     @GetMapping(value="/getAgences/{etat}")
    public List<Agence> getAgenceByEtat(@Valid @RequestParam Boolean etat)
     {
         return agenceRepository.getAgenceByEtat(etat);
     }
     @PutMapping (value="/update/{id}")
    public String updateAgence (@PathVariable Long id, @RequestBody Agence agence)
     {


         boolean exist = agenceRepository.existsById(id);
         if(exist)
         { Agence a = agenceRepository.getById(id);
             a.setNom(agence.getNom());
             a.setAdresse(agence.getAdresse());
             a.setCode(agence.getCode());
             a.setDescription(agence.getDescription());
             a.setEtat(agence.getEtat());
             agenceRepository.save(a);
             return "agence update";
         }
         return "agence in not exsit";
     }
    @GetMapping(value="/getAgences")
    public List<Agence> getAgences()
    {
        return agenceRepository.findAll();
    }

}
