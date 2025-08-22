package tech.azaria.pioloco.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.List;

/**
 * DTO pour creation de bien immobilier.
 */
@Data
public class BienImmobilierCreateDTO {
    @Positive(message = "le nombre de pieces doit etre positif")
    private int nombrePiece;

    @Positive(message = "la superficie doit etre positive")
    private double superficie;

    @Positive(message = "le prix doit etre positif")
    private double prix;

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