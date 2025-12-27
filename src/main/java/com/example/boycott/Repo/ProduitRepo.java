package com.example.boycott.Repo;

import com.example.boycott.Entities.Etat;
import com.example.boycott.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProduitRepo extends JpaRepository<Produit, Long> {

    Produit findByNomProduit(String nom);

    List<Produit> findAllByEtat(Etat etat);



}
