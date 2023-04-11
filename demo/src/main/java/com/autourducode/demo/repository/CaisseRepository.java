package com.autourducode.demo.repository;

import com.autourducode.demo.modele.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaisseRepository extends JpaRepository<Caisse, Long> {
}
