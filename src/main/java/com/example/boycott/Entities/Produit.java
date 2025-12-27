package com.example.boycott.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    //@Column(unique = true) --> pour rendre un attribut unique
    private String nomProduit;


    @Enumerated(EnumType.STRING)
    private Etat etat;



    @ManyToMany(cascade = CascadeType.ALL)
    private List<Categorie> categories;

}
