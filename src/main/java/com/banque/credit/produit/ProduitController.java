package com.banque.credit.produit;

import com.banque.credit.garants.Garants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/produit")
public class ProduitController {
  @Autowired
  ProduitRepository produitRepository;


    @PostMapping("/add")
    public Produit addProduit(@Valid @RequestBody Produit produit){


        return produitRepository.save(produit);
    }
    @GetMapping(value="/getByName/{nom}")
    public  Produit findByName(@Valid @RequestParam String nom){

        return produitRepository.findByName(nom);
    }

    @GetMapping(value="/getProduits/{etat}")
    public List<Produit> getProduitsByEtat(@Valid @RequestParam Boolean etat)
    {
        return produitRepository.getProduitByEtat(etat);
    }
    @PutMapping (value="/update/{id}")
    public String updateProduit (@PathVariable Long id, @RequestBody Produit produit)
    {


        boolean exist = produitRepository.existsById(id);
        if(exist)
        { Produit p = produitRepository.getById(id);
            p.setNom(produit.getNom());
            p.setDispo(produit.getDispo());
            p.setEchancie(produit.getEchancie());
            p.setTaux(produit.getTaux());
            p.setPeriodeGrace(produit.getPeriodeGrace());
            p.setEtat(produit.getEtat());
            produitRepository.save(p);
            return "produit update";
        }
        return "produit in not exsit";
    }
    @GetMapping(value="/getProduits")
    public List<Produit> getProduits()
    {
        return produitRepository.findAll();
    }

}
