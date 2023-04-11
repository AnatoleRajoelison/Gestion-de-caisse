package com.autourducode.demo.service;

import com.autourducode.demo.modele.Produit;
import com.autourducode.demo.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service// elle demande a spring de considerer cette classe comme etant une classe qui contient un code metier
@AllArgsConstructor

public class ProduitServiceImplement{

    private final ProduitRepository produitRepository;
    public Produit créer(Produit produit) {
        return produitRepository.save(produit);
    }
    public List<Produit> lire() {
        return produitRepository.findAll();
    }
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id)
                // si il trouve l'objet
                .map(p -> {
                    p.setNom(produit.getNom());
                    p.setPrix(produit.getPrix());
                    p.setDescription(produit.getDescription());
                    p.setCategorie((produit.getCategorie()));
                    p.setStock(produit.getStock());
                    p.setFournisseur((produit.getFournisseur()));
                    p.setCodeBarre((produit.getCodeBarre()));
                    return produitRepository.save(p); // qui dit le resultat serait garder
                }).orElseThrow(() -> new RuntimeException("produit non trouvé"));
    }
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimer";
    }
}
