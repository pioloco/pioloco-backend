package tech.azaria.pioloco.DTO;

import lombok.Data;

import java.util.List;

/**
 * DTO pour exposer une adresse.
 */
@Data
public class AdresseDTO {
    private Long idadresse;
    private String region;
    private String ville;
    private String localisation;
    private List<Long> bienImmobilierIds;
}