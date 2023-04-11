package com.autourducode.demo.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Caisse")
@Getter
@Setter
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom; // nom de la caisse
    @Column(length = 100)
    private String emplacement;
    @Column(length = 150)
    private String employéResponsable;
    private double solde;// solde actuel du caisse
    @OneToOne(cascade = CascadeType.ALL)
    private InformationConnexion informationConnexion; // les informations de connexion pour accéder à la caisse
    @OneToOne(mappedBy = "Caisse", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

}
/* NB:  nous avons utilisé l'annotation @OneToOne pour la relation entre Caisse et InformationConnexion. Cela signifie que chaque
 caisse aura une seule instance de InformationConnexion. Nous avons également utilisé l'attribut cascade de l'annotation @OneToOne
  pour spécifier que toute opération de modification, de suppression ou d'insertion effectuée sur une instance de Caisse doit
   également être effectuée sur l'instance de InformationConnexion correspondante.
 */


