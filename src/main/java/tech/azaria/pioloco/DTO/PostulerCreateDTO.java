package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * DTO pour creation d une candidature (postuler).
 */
@Data
public class PostulerCreateDTO {
    @NotNull(message = "l utilisateur est obligatoire")
    private Long userId;

    @NotNull(message = "le bien immobilier est obligatoire")
    private Long bienImmobilierId;
}