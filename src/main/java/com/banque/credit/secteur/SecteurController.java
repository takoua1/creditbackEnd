package com.banque.credit.secteur;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/secteur")
public class SecteurController {

    @Autowired
    SecteurRepository secteurRepository;

    @PostMapping("/add")
    public Secteur addSecteur(@Valid @RequestBody Secteur secteur){


        return secteurRepository.save(secteur);
    }
    @GetMapping(value="/getByName/{nom}")
    public Secteur findByName(@Valid @RequestParam String nom){

        return secteurRepository.findByName(nom);
    }

    @GetMapping(value="/getSecteurs/{etat}")
    public List<Secteur> getSecteurByEtat(@Valid @RequestParam Boolean etat)
    {
        return secteurRepository.getSecteurByEtat(etat);
    }
    @PutMapping (value="/update/{id}")
    public String updateSecteur (@PathVariable Long id, @RequestBody Secteur secteur)
    {


        boolean exist = secteurRepository.existsById(id);
        if(exist)
        { Secteur s = secteurRepository.getById(id);
            s.setNom(secteur.getNom());

            s.setEtat(secteur.getEtat());
            secteurRepository.save(s);
            return "secteur update";
        }
        return "secteur in not exsit";
    }
    @GetMapping(value="/getSecteurs")
    public List<Secteur> getSeteurs()
    {
        return secteurRepository.findAll();
    }

}
