package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour la creation d une adresse.
 */

public class AdresseCreateDTO {
    @NotBlank(message = "le champ region ne doit pas etre vide")
    private String region;

    @NotBlank(message = "le champ ville ne doit pas etre vide")
    private String ville;

    @NotBlank(message = "la localisation ne doit pas etre vide")
    private String localisation;

    public @NotBlank(message = "le champ region ne doit pas etre vide") String getRegion() {
        return region;
    }

    public void setRegion(@NotBlank(message = "le champ region ne doit pas etre vide") String region) {
        this.region = region;
    }

    public @NotBlank(message = "le champ ville ne doit pas etre vide") String getVille() {
        return ville;
    }

    public void setVille(@NotBlank(message = "le champ ville ne doit pas etre vide") String ville) {
        this.ville = ville;
    }

    public @NotBlank(message = "la localisation ne doit pas etre vide") String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(@NotBlank(message = "la localisation ne doit pas etre vide") String localisation) {
        this.localisation = localisation;
    }
}