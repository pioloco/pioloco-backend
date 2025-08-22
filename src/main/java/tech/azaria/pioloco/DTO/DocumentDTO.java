package tech.azaria.pioloco.DTO;

import lombok.Data;

/**
 * DTO pour exposer un document.
 */
@Data
public class DocumentDTO {
    private Long idDocument;
    private String nom;
    private String url;
    private Long bienImmobilierId;
}