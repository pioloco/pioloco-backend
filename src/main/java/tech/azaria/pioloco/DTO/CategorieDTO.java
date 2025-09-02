package tech.azaria.pioloco.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tech.azaria.pioloco.Entities.enums.NomCategorie;

import java.util.List;


public class CategorieDTO {
    private Long idcategorie;
    private NomCategorie nomCategorie;
    private String description;
    private List<Long> bienImmobilierIds;

    public Long getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public NomCategorie getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(NomCategorie nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getBienImmobilierIds() {
        return bienImmobilierIds;
    }

    public void setBienImmobilierIds(List<Long> bienImmobilierIds) {
        this.bienImmobilierIds = bienImmobilierIds;
    }
}