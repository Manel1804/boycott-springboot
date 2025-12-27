package com.example.boycott.Services;

import com.example.boycott.Entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    public Utilisateur ajouterUtilisateur(Utilisateur u);
    public void affecterProdAUser(List<String> nomProuit, String email);
}
