package tech.azaria.pioloco.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * DTO pour creation de bien immobilier.
 */
public class BienImmobilierCreateDTO {
    @Positive(message = "le nombre de pieces doit etre positif")
    private int nombrePiece;

    @Positive(message = "la superficie doit etre positive")
    private double superficie;

    @Positive(message = "le prix doit etre positif")
    private double prix;

    @Positive(message = "le nombre de pieces doit etre positif")
    public int getNombrePiece() {
        return nombrePiece;
    }

    public void setNombrePiece(@Positive(message = "le nombre de pieces doit etre positif") int nombrePiece) {
        this.nombrePiece = nombrePiece;
    }

    @Positive(message = "la superficie doit etre positive")
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(@Positive(message = "la superficie doit etre positive") double superficie) {
        this.superficie = superficie;
    }

    @Positive(message = "le prix doit etre positif")
    public double getPrix() {
        return prix;
    }

    public void setPrix(@Positive(message = "le prix doit etre positif") double prix) {
        this.prix = prix;
    }

    public @NotBlank(message = "la description est obligatoire") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "la description est obligatoire") String description) {
        this.description = description;
    }

    public @NotNull(message = "selectionnez une categorie pour ce bien immobilier") Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(@NotNull(message = "selectionnez une categorie pour ce bien immobilier") Long categorieId) {
        this.categorieId = categorieId;
    }

    public @NotNull(message = "l adresse est obligatoire") @Valid AdresseCreateDTO getNouvelleAdresse() {
        return nouvelleAdresse;
    }

    public void setNouvelleAdresse(@NotNull(message = "l adresse est obligatoire") @Valid AdresseCreateDTO nouvelleAdresse) {
        this.nouvelleAdresse = nouvelleAdresse;
    }

    public @NotEmpty(message = "les images sont obligatoires") @Valid List<ImageCreateDTO> getImages() {
        return images;
    }

    public void setImages(@NotEmpty(message = "les images sont obligatoires") @Valid List<ImageCreateDTO> images) {
        this.images = images;
    }

    public @NotEmpty(message = "les documents sont obligatoires") @Valid List<DocumentCreateDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(@NotEmpty(message = "les documents sont obligatoires") @Valid List<DocumentCreateDTO> documents) {
        this.documents = documents;
    }

    @NotBlank(message = "la description est obligatoire")
    private String description;

    @NotNull(message = "selectionnez une categorie pour ce bien immobilier")
    private Long categorieId;

    @NotNull(message = "l adresse est obligatoire")
    @Valid
    private AdresseCreateDTO nouvelleAdresse;

    @NotEmpty(message = "les images sont obligatoires")
    @Valid
    private List<ImageCreateDTO> images;

    @NotEmpty(message = "les documents sont obligatoires")
    @Valid
    private List<DocumentCreateDTO> documents;
}