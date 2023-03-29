package com.autourducode.demo.service;

import com.autourducode.demo.modele.Client;
import com.autourducode.demo.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientServiceImplement implements ClientService{

    private final ClientRepository clientRepository;
    @Override
    public Client créer(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> lire() {
        return clientRepository.findAll();
    }

    @Override
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

    @Override
    public String supprimer(Long id) {
        clientRepository.deleteById(id);
        return "Client supprimer";
    }
}
