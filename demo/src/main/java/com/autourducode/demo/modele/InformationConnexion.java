package com.autourducode.demo.modele;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InformationConnexion {
    @Column(length = 50)
    private String nomUtilisateur;
    @Column(length = 50)
    private String motDePasse;
}
