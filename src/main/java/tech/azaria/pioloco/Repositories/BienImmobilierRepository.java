package tech.azaria.pioloco.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.multipart.MultipartFile;
import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Entities.Categorie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BienImmobilierRepository extends JpaRepository<BienImmobilier,Long> {
    // Trouver les biens par categorie
    Page<BienImmobilier> findByCategorieId(Long categorieId, Pageable pageable);
    // par nomCategorie
    List<BienImmobilier> findByCategorieNom( String nom);
    // filtrer les biens par prix
    List<BienImmobilier> findByPrix(double prix,Pageable pageable);
    // liste des biens par nombre de pieces
    @Query("SELECT b FROM BienImmobilier b WHERE b.nbrPiece=: ")
    List<BienImmobilier> findByNbre_pieces(int nbre);
    //filtrer les immeubles par categorie,ville,nbrPieces
    Page<BienImmobilier> findByCategorieNomAndAdresseVilleAndNbrPiece(
            String  Nomcategorie,
            String ville,
            int nbrPieces,
            Pageable pageable
    );
    //filtrer les immeubles par categorie,ville,nbrPieces
    Page<BienImmobilier> findByCategorieNomAndAdresseRegionAndNbrPiece(
            String  Nomcategorie,
            String region,
            int nbrPieces,
            Pageable pageable
    );
    //filtrer les immeubles en fonction d'une certaine description
    Page<BienImmobilier> findByDescriptionContainingIgnoreCase(
            String  description,
            Pageable pageable
    );

    // liste des bien dont la superficie depasse celle donnee
    List<BienImmobilier> findBySuperficieGreaterThan(double superficie);


    void deleteBien(Long id);
    BienImmobilier getBienById(Long id);

    List<BienImmobilier> getBiensByCategorie(Long categorieId);

    List<BienImmobilier> getBiensByAdresse(Long adresseId);
    void addImageToBien(Long bienId, MultipartFile imageFile, String description);
    void addDocumentToBien(Long bienId, MultipartFile documentFile);
}
