package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.DTO.AdresseCreateDTO;
import tech.azaria.pioloco.DTO.AdresseDTO;
import tech.azaria.pioloco.Entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdresseRepository extends JpaRepository<Adresse,Long> {
    AdresseDTO createAdresse(AdresseCreateDTO adresse);
    Optional<Adresse>findAdresseById(Long idadress);
    boolean existsByVille(String ville);
    boolean existsByRegion(String region);
    boolean existsByVilleAndRegion(String ville, String region);
    List<String> findDistinctRegions();
    List<String> findDistinctVilles();

}
