package com.banque.credit.type_garanties;


import com.banque.credit.agence.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/typeGaranties")
public class TypeGarantiesController {

    @Autowired
    TypeGarantiesRepository typeRepository;

    @PostMapping("/add")
    public TypeGaranties addTypeGaranties(@Valid @RequestBody TypeGaranties typeGaranties){


        return typeRepository.save(typeGaranties);
    }
    @GetMapping(value="/getByName/{nom}")
    public  TypeGaranties  findByName(@Valid @RequestParam String nom){

        return typeRepository.findByName(nom);
    }
    @GetMapping(value="/getTypeGaranties/{etat}")
    public List<TypeGaranties> getTypeGarantiesByEtat(@Valid @RequestParam Boolean etat)
    {
        return typeRepository.getTypeGarantiesByEtat(etat);
    }
    @PutMapping (value="/update/{id}")
    public String updateTypeGaranties (@PathVariable Long id, @RequestBody TypeGaranties typeGaranties)
    {


        boolean exist = typeRepository.existsById(id);
        if(exist)
        { TypeGaranties t = typeRepository.getById(id);
            t.setNom(typeGaranties.getNom());

            t.setEtat(typeGaranties.getEtat());
            typeRepository.save(t);
            return "type garanties update";
        }
        return "type garanties in not exsit";
    }
    @GetMapping(value="/getTypeGaranties")
    public List<TypeGaranties> getTypeGaranties()
    {
        return typeRepository.findAll();
    }
}
