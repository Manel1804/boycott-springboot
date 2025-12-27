package com.example.boycott.Controller;

import com.example.boycott.Entities.Utilisateur;
import com.example.boycott.Services.IUtilisateurService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion Utilisateur")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")

public class UtilisateurController {
    private final IUtilisateurService iutilisateurService;

    @PostMapping("/ajouterUser")
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur u)
    {
        return iutilisateurService.ajouterUtilisateur(u);
    }

    @PutMapping("/affecterProduit/{nomProuit}/{email}")
    public void affecterProduit(@PathVariable  List<String> nomProuit, @PathVariable  String email){
        iutilisateurService.affecterProdAUser(nomProuit,email);
    }
}
