package com.autourducode.demo.service;

import com.autourducode.demo.modele.Caisse;
import com.autourducode.demo.modele.Transaction;
import com.autourducode.demo.repository.CaisseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CaisseService {
    private final CaisseRepository caisseRepository;
    public Caisse créer(Caisse caisse) {
        return caisseRepository.save(caisse);
    }

    public List<Caisse> lire() {
        return caisseRepository.findAll();
    }

    public Caisse modifier(Long id, Caisse caisse) {
        return caisseRepository.findById(id)
                .map(c->{
                    c.setNom(caisse.getNom());
                    c.setEmplacement((caisse.getEmplacement()));
                    c.setEmployéResponsable(caisse.getEmployéResponsable());
                    c.setSolde(caisse.getSolde());
                    c.setInformationConnexion(caisse.getInformationConnexion());
                    return caisseRepository.save(c);
                }).orElseThrow(()->new RuntimeException("Caisse non trouvé"));
    }

    public String supprimer(Long id) {
        caisseRepository.deleteById(id);
        return "Caisse supprimer";
    }
}
