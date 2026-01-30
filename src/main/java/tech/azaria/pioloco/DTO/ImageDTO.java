package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour exposer une image.
 */

public class ImageDTO {
    private Long idImage;
    private String url;
    private String nomImage; // facultatif
    private Long bienImmobilierId;

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public Long getBienImmobilierId() {
        return bienImmobilierId;
    }

    public void setBienImmobilierId(Long bienImmobilierId) {
        this.bienImmobilierId = bienImmobilierId;
    }
}