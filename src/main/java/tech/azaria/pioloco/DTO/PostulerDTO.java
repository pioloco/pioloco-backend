package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO pour exposer une candidature (postuler).
 */

public class PostulerDTO {
    private Long userId;
    private Long bienImmobilierId;
    private LocalDateTime datePostule;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBienImmobilierId() {
        return bienImmobilierId;
    }

    public void setBienImmobilierId(Long bienImmobilierId) {
        this.bienImmobilierId = bienImmobilierId;
    }

    public LocalDateTime getDatePostule() {
        return datePostule;
    }

    public void setDatePostule(LocalDateTime datePostule) {
        this.datePostule = datePostule;
    }
}