package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO pour exposer un document.
 */

public class DocumentDTO {
    private Long idDocument;
    private String nom;
    private String url;
    private Long bienImmobilierId;

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getBienImmobilierId() {
        return bienImmobilierId;
    }

    public void setBienImmobilierId(Long bienImmobilierId) {
        this.bienImmobilierId = bienImmobilierId;
    }
}