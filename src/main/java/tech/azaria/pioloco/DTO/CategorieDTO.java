package tech.azaria.pioloco.DTO;

import lombok.Data;
import tech.azaria.pioloco.Entities.enums.NomCategorie;

import java.util.List;

@Data
public class CategorieDTO {
    private Long idcategorie;
    private NomCategorie nomCategorie;
    private String description;
    private List<Long> bienImmobilierIds;
}