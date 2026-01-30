package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.DocumentCreateDTO;
import tech.azaria.pioloco.DTO.DocumentDTO;
import tech.azaria.pioloco.Entities.Document;

@Component
public class DocumentMapper {

    public Document toDocument(DocumentCreateDTO dto) {
        Document document = new Document();
        document.setNom(dto.getNom());
        document.setUrl(dto.getUrl());
        return document;
    }

    public DocumentDTO toDocumentDTO(Document document) {
        DocumentDTO dto = new DocumentDTO();
        dto.setIdDocument(document.getId_document());
        dto.setNom(document.getNom());
        dto.setUrl(document.getUrl());

        if (document.getBienImmobilier() != null) {
            dto.setBienImmobilierId(document.getBienImmobilier().getIdbien());
        }

        return dto;
    }
}