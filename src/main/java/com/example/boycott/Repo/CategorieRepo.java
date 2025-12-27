package com.example.boycott.Repo;

import com.example.boycott.Entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo  extends JpaRepository<Categorie, Long> {
}
