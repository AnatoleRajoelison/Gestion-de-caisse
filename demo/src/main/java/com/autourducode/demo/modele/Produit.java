package com.autourducode.demo.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

                    // C'est notre modele de données
@Entity // midika oe cette class represente une table
@Table(name =  "Produit")// nom de la table dans notre base de donnée
@Getter
@Setter
@NoArgsConstructor // il va generer un constructeur sans les arguments
public class Produit {
    // on le sait tous qu'une table au niveau de base de donnée a un identifiant unique
    @Id//pour mapper l'identifiant
    @GeneratedValue(strategy = GenerationType.IDENTITY)// generation auto-incrementer la generation de id
    private Long id; // notre identifiant est un int
    @Column(length = 50)// elle fixe le nombre de caractere (varchar)
    private String nom;
    @Column(length = 150)
    private String description;
    private Integer prix;
    @Column(length = 50 )
    private String categorie;
    private Integer stock;
    @Column( length = 125)
    private String fournisseur;
}
