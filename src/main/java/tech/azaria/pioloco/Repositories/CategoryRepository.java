package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categorie,Long> {
    Categorie findByNom(String nom);


}
