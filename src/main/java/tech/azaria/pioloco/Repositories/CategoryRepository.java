package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.DTO.CategorieDTO;
import tech.azaria.pioloco.Entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.azaria.pioloco.Entities.enums.NomCategorie;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categorie,Long> {
    boolean existsByNom(NomCategorie nom);


}
