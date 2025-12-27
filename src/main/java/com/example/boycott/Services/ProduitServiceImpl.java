package com.example.boycott.Services;

import com.example.boycott.Entities.Etat;
import com.example.boycott.Entities.Produit;
import com.example.boycott.Repo.CategorieRepo;
import com.example.boycott.Repo.ProduitRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProduitServiceImpl implements IProduitService {
    private final ProduitRepo produitRepo;
    private final CategorieRepo categorieRepo;

    @Override
    public Produit ajouterProduitEtCategories(Produit p) {

        return produitRepo.save(p);
    }

    @Override
    public boolean chercherProduit(String nomProduit) {
        Produit p= produitRepo.findByNomProduit(nomProduit);
        if(p!=null && p.getEtat()==Etat.BOYCOTT)
            return true;
        return false;
    }


}
