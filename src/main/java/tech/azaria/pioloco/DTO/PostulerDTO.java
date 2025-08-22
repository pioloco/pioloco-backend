package tech.azaria.pioloco.DTO;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO pour exposer une candidature (postuler).
 */
@Data
public class PostulerDTO {
    private Long userId;
    private Long bienImmobilierId;
    private LocalDateTime datePostule;
}