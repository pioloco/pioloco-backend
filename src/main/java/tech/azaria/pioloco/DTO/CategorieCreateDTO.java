package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import tech.azaria.pioloco.Entities.enums.NomCategorie;

/**
 * DTO pour creation de categorie.
 */
@Data
public class CategorieCreateDTO {
    @NotNull(message = "le nom de la categorie est obligatoire")
    private NomCategorie nomCategorie;

    @NotBlank(message = "la description est obligatoire")
    private String description;
}