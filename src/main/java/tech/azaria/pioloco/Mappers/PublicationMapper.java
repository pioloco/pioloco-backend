package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.PublicationCreateDTO;
import tech.azaria.pioloco.DTO.PublicationDTO;
import tech.azaria.pioloco.Entities.Publication;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Entities.enums.StatusPublication;
import tech.azaria.pioloco.Entities.enums.TypePublication;
import tech.azaria.pioloco.Repositories.UserRepository;
import tech.azaria.pioloco.Repositories.BienImmobilierRepository;
import java.time.LocalDateTime;

@Component
public class PublicationMapper {

    private final UserRepository userRepository;
    private final BienImmobilierRepository bienImmobilierRepository;

    public PublicationMapper(UserRepository userRepository, BienImmobilierRepository bienImmobilierRepository) {
        this.userRepository = userRepository;
        this.bienImmobilierRepository = bienImmobilierRepository;
    }

    public Publication toPublication(PublicationCreateDTO dto, Long userId, Long bienImmobilierId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));

        BienImmobilier bienImmobilier = bienImmobilierRepository.findById(bienImmobilierId)
                .orElseThrow(() -> new RuntimeException("Bien immobilier non trouvé"));

        return new Publication(
                user,
                bienImmobilier,
                LocalDateTime.now(),
                StatusPublication.EN_ATTENTE,
                dto.getTypePublication()
        );
    }

    public PublicationDTO toPublicationDTO(Publication publication) {
        PublicationDTO dto = new PublicationDTO();
        dto.setDatePublication(publication.getDatepublication());
        dto.setStatusPublication(publication.getStatut());
        dto.setTypePublication(publication.getTypePublication());

        if (publication.getUser() != null) {
            dto.setUserId(publication.getUser().getIduser());
        }

        if (publication.getBienImmobilier() != null) {
            dto.setBienImmobilierId(publication.getBienImmobilier().getIdbien());
        }

        return dto;
    }
}