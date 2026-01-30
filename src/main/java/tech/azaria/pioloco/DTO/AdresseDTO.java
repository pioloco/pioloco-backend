package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * DTO pour exposer une adresse.
 */
public class AdresseDTO {
    private Long idadresse;
    private String region;
    private String ville;
    private String localisation;
    private List<Long> bienImmobilierIds;

    public Long getIdadresse() {
        return idadresse;
    }

    public void setIdadresse(Long idadresse) {
        this.idadresse = idadresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public List<Long> getBienImmobilierIds() {
        return bienImmobilierIds;
    }

    public void setBienImmobilierIds(List<Long> bienImmobilierIds) {
        this.bienImmobilierIds = bienImmobilierIds;
    }
}