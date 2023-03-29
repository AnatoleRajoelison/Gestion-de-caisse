package com.autourducode.demo.service;

import com.autourducode.demo.modele.Produit;

import java.util.List;
import java.util.Optional;

// Couche Service ou couche metier tout tourne autour de ça
public interface ProduitService {

    Produit créer (Produit produit);
    List<Produit> lire();
    Produit modifier(Long id, Produit produit);// Long id = l'identifiant du produit, Produit produit = le nom du produit a modifier
    String supprimer(Long id);
}
