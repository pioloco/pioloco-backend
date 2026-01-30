package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.AdresseCreateDTO;
import tech.azaria.pioloco.DTO.AdresseDTO;
import tech.azaria.pioloco.Entities.Adresse;
import tech.azaria.pioloco.Entities.BienImmobilier;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdresseMapper {

    public Adresse toAdresse(AdresseCreateDTO dto) {
        Adresse adresse = new Adresse();
        adresse.setRegion(dto.getRegion());
        adresse.setVille(dto.getVille());
        adresse.setLocalisation(dto.getLocalisation());
        return adresse;
    }

    public AdresseDTO toAdresseDTO(Adresse adresse) {
        AdresseDTO dto = new AdresseDTO();
        dto.setIdadresse(adresse.getIdadresse());
        dto.setRegion(adresse.getRegion());
        dto.setVille(adresse.getVille());
        dto.setLocalisation(adresse.getLocalisation());

        if (adresse.getBienImmobiliers() != null) {
            dto.setBienImmobilierIds(adresse.getBienImmobiliers().stream()
                    .map(BienImmobilier::getIdbien)
                    .collect(Collectors.toList()));
        }

        return dto;
    }
}