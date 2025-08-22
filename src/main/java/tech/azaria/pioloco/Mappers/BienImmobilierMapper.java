package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.BienImmobilierCreateDTO;
import tech.azaria.pioloco.DTO.BienImmobilierDTO;
import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Entities.Image;
import tech.azaria.pioloco.Entities.Document;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BienImmobilierMapper {

    public BienImmobilierDTO toBienImmobilierDTO(BienImmobilier bien) {
        BienImmobilierDTO dto = new BienImmobilierDTO();
        dto.setIdbien(bien.getIdbien());
        dto.setNombrePiece(bien.getNombrePiece());
        dto.setSuperficie(bien.getSuperficie());
        dto.setPrix(bien.getPrix());
        dto.setDescription(bien.getDescription());
        dto.setStatut(bien.getStatus());

        if (bien.getCategorie() != null) {
            dto.setCategorieId(bien.getCategorie().getIdcategorie());
        }

        if (bien.getAdresse() != null) {
            dto.setAdresseId(bien.getAdresse().getIdadresse());
        }

        if (bien.getImages() != null) {
            dto.setImagesIds(bien.getImages().stream()
                    .map(Image::getId_image)
                    .collect(Collectors.toList()));
        }

        if (bien.getDocuments() != null) {
            dto.setDocumentsIds(bien.getDocuments().stream()
                    .map(Document::getId_document)
                    .collect(Collectors.toList()));
        }

        return dto;
    }
}