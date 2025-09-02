package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tech.azaria.pioloco.Entities.enums.NomCategorie;

/**
 * DTO pour creation de categorie.
 */

public class CategorieCreateDTO {
    @NotNull(message = "le nom de la categorie est obligatoire")
    private NomCategorie nomCategorie;

    @NotBlank(message = "la description est obligatoire")
    private String description;

    public @NotNull(message = "le nom de la categorie est obligatoire") NomCategorie getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(@NotNull(message = "le nom de la categorie est obligatoire") NomCategorie nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public @NotBlank(message = "la description est obligatoire") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "la description est obligatoire") String description) {
        this.description = description;
    }
}