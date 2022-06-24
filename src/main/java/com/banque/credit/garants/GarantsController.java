package com.banque.credit.garants;


import com.banque.credit.profession.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/garants")

public class GarantsController {
    @Autowired
    GarantsRepository garantsRepository;

    @PostMapping("/add")
    public Garants addProfession(@Valid @RequestBody Garants garants){


        return garantsRepository.save(garants);
    }
    @GetMapping(value="/getByName/{nom}")
    public  Garants findByName(@Valid @RequestParam String nom){

        return garantsRepository.findByName(nom);
    }

    @GetMapping(value="/getGarants/{etat}")
    public List<Garants> getProfessionByEtat(@Valid @RequestParam Boolean etat)
    {
        return garantsRepository.getGarantsByEtat(etat);
    }
    @PutMapping (value="/update/{id}")
    public String updateGarants (@PathVariable Long id, @RequestBody Garants garants)
    {


        boolean exist = garantsRepository.existsById(id);
        if(exist)
        { Garants g = garantsRepository.getById(id);
            g.setNom(garants.getNom());
            g.setMontant(garants.getMontant());
            g.setRelation(garants.getRelation());
            g.setDescription(garants.getDescription());
            g.setEtat(garants.getEtat());
            garantsRepository.save(g);
            return "garants update";
        }
        return "garants in not exsit";
    }
    @GetMapping(value="/getGarants")
    public List<Garants> getGarants()
    {
        return garantsRepository.findAll();
    }
}
