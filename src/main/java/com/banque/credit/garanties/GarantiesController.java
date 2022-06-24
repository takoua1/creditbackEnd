package com.banque.credit.garanties;

import com.banque.credit.agence.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping(path = "/garanties")
public class GarantiesController {


@Autowired
GarantiesRepository garantiesRepository;
    @PostMapping("/add")
    public Garanties addGaranties(@Valid @RequestBody Garanties garanties){


        return garantiesRepository.save(garanties);
    }
    @GetMapping(value="/getByName/{nom}")
    public Garanties findByName(@Valid @RequestParam String nom){

        return garantiesRepository.findByName(nom);
    }
    @GetMapping(value="/getGaranties/{etat}")
    public List<Garanties> getGarantiesByEtat(@Valid @RequestParam Boolean etat)
    {
        return garantiesRepository.getGarantiesByEtat(etat);
    }
    @PutMapping(value="/update/{id}")
    public String updateGaranties (@PathVariable Long id, @RequestBody Garanties garanties)
    {


        boolean exist = garantiesRepository.existsById(id);
        if(exist)
        { Garanties g = garantiesRepository.getById(id);
            g.setNom(garanties.getNom());
            g.setMontant(garanties.getMontant());
            g.setTypeGaranties(garanties.getTypeGaranties());
            g.setEtat(garanties.getEtat());
            garantiesRepository.save(g);
            return "garanties update";
        }
        return "garanties in not exsit";
    }
    @GetMapping(value="/getGaranties")
    public List<Garanties> getGaranties()
    {
        return garantiesRepository.findAll();
    }
}
