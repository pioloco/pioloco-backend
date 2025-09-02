package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tech.azaria.pioloco.Entities.enums.TypePublication;

/**
 * DTO pour creation de publication.
 */

public class PublicationCreateDTO {
    @NotNull(message = "la nature de la publication est obligatoire")
    private TypePublication typePublication;

    public @NotNull(message = "la nature de la publication est obligatoire") TypePublication getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(@NotNull(message = "la nature de la publication est obligatoire") TypePublication typePublication) {
        this.typePublication = typePublication;
    }
}