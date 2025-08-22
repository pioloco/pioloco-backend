package tech.azaria.pioloco.DTO;

import lombok.Data;
import tech.azaria.pioloco.Entities.enums.Statut;

import java.util.List;

/**
 * DTO pour exposer un bien immobilier.
 */
@Data
public class BienImmobilierDTO {
    private Long idbien;
    private int nombrePiece;
    private double superficie;
    private double prix;
    private String description;
    private Statut statut;
    private Long categorieId;
    private Long adresseId;
    private List<Long> imagesIds;
    private List<Long> documentsIds;
}