package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour creation de document.
 */
public class DocumentCreateDTO {
    @NotBlank(message = "le nom du document est obligatoire")
    private String nom;

    @NotBlank(message = "l url du document est obligatoire")
    private String url;

    public @NotBlank(message = "le nom du document est obligatoire") String getNom() {
        return nom;
    }

    public void setNom(@NotBlank(message = "le nom du document est obligatoire") String nom) {
        this.nom = nom;
    }

    public @NotBlank(message = "l url du document est obligatoire") String getUrl() {
        return url;
    }

    public void setUrl(@NotBlank(message = "l url du document est obligatoire") String url) {
        this.url = url;
    }
}