package tech.azaria.pioloco.DTO;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO pour exposer un credit utilisateur.
 */
@Data
public class CreditDTO {
    private Long idCredit;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int nombreCredits;
    private double montant;
    private Long idUser;
}