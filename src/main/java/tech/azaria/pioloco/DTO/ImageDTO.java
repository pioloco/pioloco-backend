package tech.azaria.pioloco.DTO;

import lombok.Data;

/**
 * DTO pour exposer une image.
 */
@Data
public class ImageDTO {
    private Long idImage;
    private String url;
    private String nomImage; // facultatif
    private Long bienImmobilierId;
}