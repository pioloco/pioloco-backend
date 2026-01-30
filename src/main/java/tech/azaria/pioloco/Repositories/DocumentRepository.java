package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findByBienImmobilier_Id(Long bienId);
}
