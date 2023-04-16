package com.autourducode.demo.modele;

import com.autourducode.demo.enumerateur.ModeDePaiement;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Embeddable
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double montant;
    private double remise;//Les remises appliquées à la transaction, s'il y en a.
    private double taxe;//Les taxes appliquées à la transaction, s'il y en a.

    @ManyToOne
    @JoinColumn(name = "caisse_id")
    private Caisse caisse;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    @Column(name = "mode de paiement")
    @Enumerated(EnumType.STRING)
    private ModeDePaiement modeDePaiement;

}
