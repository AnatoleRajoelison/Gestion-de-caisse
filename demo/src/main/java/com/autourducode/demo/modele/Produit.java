package com.autourducode.demo.modele;

import com.autourducode.demo.enumerateur.Categorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

                    // C'est notre modele de données
@Entity // midika oe cette class represente une table
@Table(name =  "Produit")// nom de la table dans notre base de donnée
@Getter
@Setter
@AllArgsConstructor
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
    private Integer stock;
    @Column( length = 125)
    private String fournisseur;
    private Integer codeBarre;
    @Column(name = "categorie")
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    @Column(name = "date d'ajout")
    private Date dateAjout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id")
    private Image image;
 }
