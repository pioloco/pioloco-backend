package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import tech.azaria.pioloco.Entities.enums.TypePublication;

/**
 * DTO pour creation de publication.
 */
@Data
public class PublicationCreateDTO {
    @NotNull(message = "la nature de la publication est obligatoire")
    private TypePublication typePublication;
}