package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.CategorieCreateDTO;
import tech.azaria.pioloco.DTO.CategorieDTO;
import tech.azaria.pioloco.Entities.Categorie;
import tech.azaria.pioloco.Entities.BienImmobilier;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategorieMapper {

    public Categorie toCategorie(CategorieCreateDTO dto) {
        Categorie categorie = new Categorie();
        categorie.setNom(dto.getNomCategorie());
        categorie.setDescription(dto.getDescription());
        return categorie;
    }

    public CategorieDTO toCategorieDTO(Categorie categorie) {
        CategorieDTO dto = new CategorieDTO();
        dto.setIdcategorie(categorie.getIdcategorie());
        dto.setNomCategorie(categorie.getNom());
        dto.setDescription(categorie.getDescription());

        if (categorie.getBienImmobiliers() != null) {
            dto.setBienImmobilierIds(categorie.getBienImmobiliers().stream()
                    .map(BienImmobilier::getIdbien)
                    .collect(Collectors.toList()));
        }

        return dto;
    }
}