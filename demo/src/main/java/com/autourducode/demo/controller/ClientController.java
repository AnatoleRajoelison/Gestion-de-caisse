package com.autourducode.demo.controller;

import com.autourducode.demo.modele.Client;
import com.autourducode.demo.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor

public class ClientController {

    private final ClientService clientService;
    @PostMapping("/client")
    public Client create(@RequestBody Client client){
        return clientService.créer(client);
    }
    @GetMapping("/read")
    public List<Client> read(){
        return clientService.lire();
    }
    @PutMapping("/update/{id}")
    public Client update (@PathVariable Long id,@RequestBody Client client){
        return clientService.modifier(id, client);
    }
    @DeleteMapping
    public String delete (@PathVariable Long id){
        return clientService.supprimer(id);
    }

}
