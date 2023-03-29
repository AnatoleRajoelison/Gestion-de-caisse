package com.autourducode.demo.controller;

import com.autourducode.demo.modele.Employer;
import com.autourducode.demo.service.EmployerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/employer")
@AllArgsConstructor

public class EmployerController {
    private final EmployerService employerService;
    @PostMapping("/create")
    public Employer create (@RequestBody Employer employer){
        return employerService.créer(employer);
    }
    @GetMapping("/read")
    public List<Employer> read(){
        return employerService.lire();
    }
    @PutMapping("/update/{id}")
    public Employer update (@PathVariable Long id, @RequestBody Employer employer){
        return employerService.modifier(id, employer);
    }
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return employerService.supprimer(id);
    }
}
