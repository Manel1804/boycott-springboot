package com.example.boycott.Services;

import com.example.boycott.Entities.Etat;
import com.example.boycott.Entities.Produit;

import java.util.List;

public interface IProduitService {

    public Produit ajouterProduitEtCategories (Produit p);
    public boolean chercherProduit (String nomProduit);
}
