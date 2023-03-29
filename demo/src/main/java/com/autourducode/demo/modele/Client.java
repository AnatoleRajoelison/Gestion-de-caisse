package com.autourducode.demo.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Client")
@Getter
@Setter
@AllArgsConstructor
public class Client {
    @Id//pour mapper l'identifiant
    @GeneratedValue(strategy = GenerationType.IDENTITY)// generation auto-incrementer la generation de id
    private Long id; // notre identifiant est un int
    @Column(length = 50)// elle fixe le nombre de caractere (varchar)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @Column(length = 50)
    private String adresse;
    private Integer tel;
    @Column(length = 100)
    private String mail;
}
