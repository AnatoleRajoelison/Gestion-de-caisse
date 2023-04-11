package com.autourducode.demo.service;

import com.autourducode.demo.modele.Transaction;
import com.autourducode.demo.repository.CaisseRepository;
import com.autourducode.demo.repository.EmployerRepository;
import com.autourducode.demo.repository.ProduitRepository;
import com.autourducode.demo.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final ProduitRepository produitRepository;
    private final EmployerRepository employerRepository;
    private final CaisseRepository caisseRepository;

    public Transaction créer (Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public List<Transaction> lire(){
        return transactionRepository.findAll();
    }

    public Transaction modifier(Long id, Transaction transaction){
        return transactionRepository.findById(id)
                .map(t->{
                    t.setCaisse(transaction.getCaisse());
                    t.setEmployer((transaction.getEmployer()));
                    t.setDate(transaction.getDate());
                    t.setRemise((transaction.getRemise()));
                    t.setMontant(transaction.getMontant());
                    t.setTaxe((transaction.getTaxe()));
                    t.setProduit(transaction.getProduit());
                    return transactionRepository.save(t) ;
                }).orElseThrow(()->new RuntimeException("On a trouveé la transaction"));
    }
    public String supprimer(Long id){
        transactionRepository.deleteById(id);
        return "transaction supprimer";
    }
}
