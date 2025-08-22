package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * DTO pour creation d une image.
 */
@Data
public class ImageCreateDTO {
    @NotBlank(message = "l url de l image est obligatoire")
    private String url;

    // Champ optionnel
    private String nomImage;
}