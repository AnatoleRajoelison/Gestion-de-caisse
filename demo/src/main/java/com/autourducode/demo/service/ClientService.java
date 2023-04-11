package com.autourducode.demo.service;

import com.autourducode.demo.modele.Client;
import com.autourducode.demo.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientService {

    private final ClientRepository clientRepository;
    public Client créer(Client client) {
        return clientRepository.save(client);
    }
    public List<Client> lire() {
        return clientRepository.findAll();
    }
    public Client modifier(Long id, Client client) {
        return clientRepository.findById(id)
                //si il trouve la personne
                .map(c->{
                    c.setNom(client.getNom());
                    c.setPrenom(client.getPrenom());
                    c.setAdresse((client.getAdresse()));
                    c.setMail(client.getMail());
                    c.setTel(client.getTel());
                    return clientRepository.save(c);
                }).orElseThrow(()->new RuntimeException("client non trouvé"));
    }
    public String supprimer(Long id) {
        clientRepository.deleteById(id);
        return "Client supprimer";
    }
}
