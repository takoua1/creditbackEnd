package com.banque.credit.profession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/profession")
public class ProfessionController {

    @Autowired
    ProfessionRepository professionRepository;

    @PostMapping("/add")
    public Profession addProfession(@Valid @RequestBody Profession profession){


        return professionRepository.save(profession);
    }
    @GetMapping(value="/getByName/{nom}")
    public Profession findByName(@Valid @RequestParam String nom){

        return professionRepository.findByName(nom);
    }

    @GetMapping(value="/getProfessions/{etat}")
    public List<Profession> getProfessionByEtat(@Valid @RequestParam Boolean etat)
    {
        return professionRepository.getProfessionByEtat(etat);
    }
    @PutMapping (value="/update/{id}")
    public String update (@PathVariable Long id, @RequestBody Profession profession)
    {


        boolean exist = professionRepository.existsById(id);
        if(exist)
        { Profession p = professionRepository.getById(id);
            p.setNom(profession.getNom());

            p.setEtat(profession.getEtat());
            professionRepository.save(p);
            return "profession update";
        }
        return "profession in not exsit";
    }
    @GetMapping(value="/getProfessions")
    public List<Profession> getProfessions()
    {
        return professionRepository.findAll();
    }
}
