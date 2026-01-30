package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour creation d une candidature (postuler).
 */

public class PostulerCreateDTO {
    @NotNull(message = "l utilisateur est obligatoire")
    private Long userId;

    @NotNull(message = "le bien immobilier est obligatoire")
    private Long bienImmobilierId;

    public @NotNull(message = "l utilisateur est obligatoire") Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "l utilisateur est obligatoire") Long userId) {
        this.userId = userId;
    }

    public @NotNull(message = "le bien immobilier est obligatoire") Long getBienImmobilierId() {
        return bienImmobilierId;
    }

    public void setBienImmobilierId(@NotNull(message = "le bien immobilier est obligatoire") Long bienImmobilierId) {
        this.bienImmobilierId = bienImmobilierId;
    }
}