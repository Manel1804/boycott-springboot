package com.example.boycott.Controller;

import com.example.boycott.Entities.Produit;
import com.example.boycott.Entities.Utilisateur;
import com.example.boycott.Services.IProduitService;
import com.example.boycott.Services.IUtilisateurService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name="Gestion Produit")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/produit")

public class ProduitController {

    private final IProduitService iproduitService;

    @PostMapping("/ajouterProduit")
    public Produit ajouteProduit(@RequestBody Produit p)
    {
        return iproduitService.ajouterProduitEtCategories(p);
    }

    @GetMapping("/chercherParEtat/{nomProduit}")
    public Boolean chercherParEtat(@PathVariable String nomProduit)
    {
        return iproduitService.chercherProduit(nomProduit);
    }
}
