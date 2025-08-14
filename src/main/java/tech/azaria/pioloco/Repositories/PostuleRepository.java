package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Postuler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostuleRepository extends JpaRepository<Postuler,Long> {
    // Trouver les postulations d'un user
    List<Postuler> findByUser_Id(Long userId);

    // Trouver les postulations pour un bien
    List<Postuler> findByBienImmobilier_Id(Long bienId);
}
