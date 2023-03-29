package com.autourducode.demo.service;

import com.autourducode.demo.modele.Employer;

import java.util.List;

public interface EmployerService {
    Employer créer (Employer employer);
    List<Employer> lire();
    Employer modifier (Long id, Employer employer);
    String supprimer (Long id);
}
