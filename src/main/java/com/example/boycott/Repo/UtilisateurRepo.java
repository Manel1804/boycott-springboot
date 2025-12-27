package com.example.boycott.Repo;

import com.example.boycott.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Long> {

    Utilisateur findByEmail(String email);
}
