package com.autourducode.demo.service;

import com.autourducode.demo.modele.Client;

import java.util.List;


public interface ClientService {
    Client créer (Client client);
    List<Client> lire();
    Client modifier (Long id, Client client);
    String supprimer(Long id);
}
