package com.autourducode.demo.controller;

import com.autourducode.demo.modele.Transaction;
import com.autourducode.demo.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/create")
    public Transaction create(@RequestBody Transaction transaction){
        return transactionService.créer(transaction);
    }
    @PutMapping("/update/{id")
    public  Transaction update(@PathVariable Long id,@RequestBody Transaction transaction){
        return transactionService.modifier(id,transaction);
    }
    @GetMapping("/read")
    public List<Transaction> lire(){
        return transactionService.lire();
    }
    @DeleteMapping("/delete/{id}")
    public String delete(Long id){
        return transactionService.supprimer(id);
    }
}
