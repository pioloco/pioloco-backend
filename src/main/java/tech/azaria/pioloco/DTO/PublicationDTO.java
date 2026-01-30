package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tech.azaria.pioloco.Entities.enums.StatusPublication;
import tech.azaria.pioloco.Entities.enums.TypePublication;

import java.time.LocalDateTime;

/**
 * DTO pour exposer une publication.
 */

public class PublicationDTO {
    private Long userId;
    private Long bienImmobilierId;
    private LocalDateTime datePublication;
    private StatusPublication statusPublication;
    private TypePublication typePublication;

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

    public LocalDateTime getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDateTime datePublication) {
        this.datePublication = datePublication;
    }

    public StatusPublication getStatusPublication() {
        return statusPublication;
    }

    public void setStatusPublication(StatusPublication statusPublication) {
        this.statusPublication = statusPublication;
    }

    public TypePublication getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(TypePublication typePublication) {
        this.typePublication = typePublication;
    }
}