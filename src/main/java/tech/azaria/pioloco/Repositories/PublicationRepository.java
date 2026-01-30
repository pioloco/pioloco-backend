package tech.azaria.pioloco.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.azaria.pioloco.Entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication,Long> {
    //filtrer par date de publication recente
    List<Publication> findAllByOrderByDatepublicationDesc();

    // filtrer par type de publication soit location ou vente
    List<Publication> findByTypePublication(String typepublication);

    // liste des publication d'un user donne
    @Query("SELECT p FROM Publication p WHERE p.user.iduser = :userId")
    List<Publication> findByUserId(@Param("userId") Long userId);

    // Publications pour une ville donnee
    @Query("SELECT p FROM Publication p WHERE p.bienImmobilier.adresse.ville = :ville")
    List<Publication> findByVille(@Param("ville") String ville);

    // Publications pour une region specifique
    @Query("SELECT p FROM Publication p WHERE p.bienImmobilier.adresse.region = :region")
    List<Publication> findByRegion(@Param("region") String region);
    // publication en fonction du type et d'un certain prix
    @Query("SELECT p FROM Publication p WHERE p.bienImmobilier.prix <=: prixBien")
    List<Publication> PublicationParPrix(@Param("prixBien") double prixBien);

}
