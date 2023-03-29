package com.autourducode.demo.service;

import com.autourducode.demo.modele.Employer;
import com.autourducode.demo.repository.EmployerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployerServiceImplement implements EmployerService{
    private final EmployerRepository employerRepository;
    @Override
    public Employer créer(Employer employer) {
        return employerRepository.save(employer);
    }

    @Override
    public List<Employer> lire() {
        return employerRepository.findAll();
    }

    @Override
    public Employer modifier(Long id, Employer employer) {
        return employerRepository.findById(id)
                // si l'objet est trouver

                .map(e->{
                    e.setNom(employer.getNom());
                    e.setPrenom((employer.getPrenom()));
                    e.setMail(employer.getMail());
                    e.setFonction(employer.getFonction());
                    e.setRole(employer.getRole());
                    e.setTel(employer.getTel());
                    e.setNombreHeureTravail(employer.getNombreHeureTravail());
                    e.setSalaire(employer.getSalaire());
                    return employerRepository.save(e);
                }).orElseThrow(()-> new RuntimeException("Employer non trouver"));
    }

    @Override
    public String supprimer(Long id) {
        employerRepository.deleteById(id);
        return "Employer supprimer";
    }
}
