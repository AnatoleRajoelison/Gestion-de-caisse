package com.autourducode.demo.repository;

import com.autourducode.demo.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{// Produit = Entity, Long= id
}
