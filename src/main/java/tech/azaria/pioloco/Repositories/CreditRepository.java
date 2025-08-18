package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditRepository extends JpaRepository<Credit,Long> {
    // Trouver les credits d'un user
    List<Credit> findByUser
}
