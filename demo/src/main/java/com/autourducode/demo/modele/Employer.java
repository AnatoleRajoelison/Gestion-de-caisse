package com.autourducode.demo.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employer")
@Getter
@Setter
@NoArgsConstructor
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @Column(length = 100)
    private String mail;
    private Integer tel;
    @Column(length = 50)
    private String fonction;//Le poste occupé par l'employé dans l'entreprise
    private Integer salaire;
    private Long nombreHeureTravail;
    @Column(length = 250)
    private String role;
}
