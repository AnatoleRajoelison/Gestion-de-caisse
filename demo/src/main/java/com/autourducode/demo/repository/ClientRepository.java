package com.autourducode.demo.repository;

import com.autourducode.demo.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long > {
}
