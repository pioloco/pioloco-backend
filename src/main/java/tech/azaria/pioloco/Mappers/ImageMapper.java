package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.ImageCreateDTO;
import tech.azaria.pioloco.DTO.ImageDTO;
import tech.azaria.pioloco.Entities.Image;

@Component
public class ImageMapper {

    public Image toImage(ImageCreateDTO dto) {
        Image image = new Image();
        image.setUrl(dto.getUrl());
        image.setNomImage(dto.getNomImage());
        return image;
    }

    public ImageDTO toImageDTO(Image image) {
        ImageDTO dto = new ImageDTO();
        dto.setIdImage(image.getId_image());
        dto.setUrl(image.getUrl());
        dto.setNomImage(image.getNomImage());

        if (image.getBienImmobilier() != null) {
            dto.setBienImmobilierId(image.getBienImmobilier().getIdbien());
        }

        return dto;
    }
}