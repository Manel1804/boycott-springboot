package com.example.boycott.Services;

import com.example.boycott.Entities.Produit;
import com.example.boycott.Entities.Utilisateur;
import com.example.boycott.Repo.ProduitRepo;
import com.example.boycott.Repo.UtilisateurRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UtilisateurServiceImpl implements IUtilisateurService {
    private final UtilisateurRepo utilisateurRepo;
    private final ProduitRepo produitRepo;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepo.save(u);
    }

    @Override
    public void affecterProdAUser(List<String> nomProuit, String email) {
        Utilisateur u = utilisateurRepo.findByEmail(email);

        for(String nom : nomProuit) {
            Produit p = produitRepo.findByNomProduit(nom);
            u.getProduits().add(p);
        }
        utilisateurRepo.save(u);
    }
}
