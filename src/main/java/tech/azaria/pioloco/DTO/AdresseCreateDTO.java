package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * DTO pour la creation d une adresse.
 */
@Data
public class AdresseCreateDTO {
    @NotBlank(message = "le champ region ne doit pas etre vide")
    private String region;

    @NotBlank(message = "le champ ville ne doit pas etre vide")
    private String ville;

    @NotBlank(message = "la localisation ne doit pas etre vide")
    private String localisation;
}