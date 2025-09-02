package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tech.azaria.pioloco.Entities.enums.Statut;

import java.util.List;

/**
 * DTO pour exposer un bien immobilier.
 */
public class BienImmobilierDTO {
    private Long idbien;
    private int nombrePiece;
    private double superficie;
    private double prix;
    private String description;
    private Statut statut;
    private Long categorieId;
    private Long adresseId;
    private List<Long> imagesIds;
    private List<Long> documentsIds;

    public Long getIdbien() {
        return idbien;
    }

    public void setIdbien(Long idbien) {
        this.idbien = idbien;
    }

    public int getNombrePiece() {
        return nombrePiece;
    }

    public void setNombrePiece(int nombrePiece) {
        this.nombrePiece = nombrePiece;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    public Long getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public List<Long> getImagesIds() {
        return imagesIds;
    }

    public void setImagesIds(List<Long> imagesIds) {
        this.imagesIds = imagesIds;
    }

    public List<Long> getDocumentsIds() {
        return documentsIds;
    }

    public void setDocumentsIds(List<Long> documentsIds) {
        this.documentsIds = documentsIds;
    }
}