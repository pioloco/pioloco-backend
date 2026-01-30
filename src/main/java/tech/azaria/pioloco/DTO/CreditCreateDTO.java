package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO pour creation de credit.
 */

public class CreditCreateDTO {
    @NotNull(message = "la date de fin du credit est obligatoire")
    private LocalDateTime dateFin;

    @PositiveOrZero(message = "le nombre de credits doit etre positif")
    private int nombreCredits;

    public @NotNull(message = "la date de fin du credit est obligatoire") LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(@NotNull(message = "la date de fin du credit est obligatoire") LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    @PositiveOrZero(message = "le nombre de credits doit etre positif")
    public int getNombreCredits() {
        return nombreCredits;
    }

    public void setNombreCredits(@PositiveOrZero(message = "le nombre de credits doit etre positif") int nombreCredits) {
        this.nombreCredits = nombreCredits;
    }
}