package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse,Long> {
    boolean existsByVille(String ville);
    boolean existsByRegion(String region);
    boolean existsByVilleAndRegion(String ville, String region);
    List<String> findDistinctRegions();
    List<String> findDistinctVilles();

}
