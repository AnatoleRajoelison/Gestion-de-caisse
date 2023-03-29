package com.autourducode.demo.controller;

                        // Contrôleur va exposé notre produit sur le web

import com.autourducode.demo.modele.Produit;
import com.autourducode.demo.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // c'est pour que spring identifie cette classe comme contrôleur
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    private final ProduitService produitService;
    /* cette methode ne veut rien dire car le contrôleur ne va rien connaitre quand il va recevoir une requête

    alors pour pouvoir le mapper avec un verbe http nous allons utiliser l'annotation @PostMapping
     */
    @PostMapping("/create")
    public Produit create (@RequestBody Produit produit){ /* @RequestBody c'est pour que spring puisse envoyé les données au niveau
    du body de la requete */
        return produitService.créer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public Produit update (@PathVariable Long id,@RequestBody Produit produit){ /* @Pathvariable pour preciser rehefa manao recherche
        @na requette iray */
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable  Long id){
        return produitService.supprimer(id);
    }
}
