package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO pour creation de credit.
 */
@Data
public class CreditCreateDTO {
    @NotNull(message = "la date de fin du credit est obligatoire")
    private LocalDateTime dateFin;

    @PositiveOrZero(message = "le nombre de credits doit etre positif")
    private int nombreCredits;
}