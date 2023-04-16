package com.autourducode.demo.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Embeddable
public class InformationConnexion {
    @Column(length = 50)
    private String nomUtilisateur;
    @Column(length = 50)
    private String motDePasse;
}
