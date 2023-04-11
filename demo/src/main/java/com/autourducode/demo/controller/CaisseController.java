package com.autourducode.demo.controller;

import com.autourducode.demo.modele.Caisse;
import com.autourducode.demo.service.CaisseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class CaisseController {
    private final CaisseService caisseService;
    @PostMapping("/create")
    public Caisse create(@RequestBody Caisse caisse){
        return caisseService.créer(caisse);
    }
    @GetMapping("/read")
    public List<Caisse> read(){
        return caisseService.lire();
    }
    @PutMapping("/update/{id}")
    public Caisse update(@PathVariable Long id,@RequestBody Caisse caisse){
        return caisseService.modifier(id, caisse);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return caisseService.supprimer(id);
    }
}
