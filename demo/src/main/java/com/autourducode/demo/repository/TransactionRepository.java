package com.autourducode.demo.repository;

import com.autourducode.demo.modele.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
