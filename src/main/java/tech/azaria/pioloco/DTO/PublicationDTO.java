package tech.azaria.pioloco.DTO;

import lombok.Data;
import tech.azaria.pioloco.Entities.enums.StatusPublication;
import tech.azaria.pioloco.Entities.enums.TypePublication;

import java.time.LocalDateTime;

/**
 * DTO pour exposer une publication.
 */
@Data
public class PublicationDTO {
    private Long userId;
    private Long bienImmobilierId;
    private LocalDateTime datePublication;
    private StatusPublication statusPublication;
    private TypePublication typePublication;
}