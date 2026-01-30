package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO pour exposer un credit utilisateur.
 */

public class CreditDTO {
    private Long idCredit;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int nombreCredits;
    private double montant;
    private Long idUser;

    public Long getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Long idCredit) {
        this.idCredit = idCredit;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public int getNombreCredits() {
        return nombreCredits;
    }

    public void setNombreCredits(int nombreCredits) {
        this.nombreCredits = nombreCredits;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}