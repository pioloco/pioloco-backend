package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Long> {
    // Trouver toutes les images d'un bien
    List<Image> findByBienImmobilier_Id(Long bienId);

    // Supprimer toutes les images d'un bien (utile pour les mises à jour)
    void deleteByBienImmobilier_Id(Long bienId);
}
