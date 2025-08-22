package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * DTO pour creation de document.
 */
@Data
public class DocumentCreateDTO {
    @NotBlank(message = "le nom du document est obligatoire")
    private String nom;

    @NotBlank(message = "l url du document est obligatoire")
    private String url;
}