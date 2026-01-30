package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour creation d une image.
 */

public class ImageCreateDTO {
    @NotBlank(message = "l url de l image est obligatoire")
    private String url;

    // Champ optionnel
    private String nomImage;

    public @NotBlank(message = "l url de l image est obligatoire") String getUrl() {
        return url;
    }

    public void setUrl(@NotBlank(message = "l url de l image est obligatoire") String url) {
        this.url = url;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }
}