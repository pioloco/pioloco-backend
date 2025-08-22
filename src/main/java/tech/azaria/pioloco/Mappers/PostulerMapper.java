package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.PostulerCreateDTO;
import tech.azaria.pioloco.DTO.PostulerDTO;
import tech.azaria.pioloco.Entities.Postuler;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Repositories.UserRepository;
import tech.azaria.pioloco.Repositories.BienImmobilierRepository;
import java.time.LocalDateTime;

@Component
public class PostulerMapper {

    private final UserRepository userRepository;
    private final BienImmobilierRepository bienImmobilierRepository;

    public PostulerMapper(UserRepository userRepository, BienImmobilierRepository bienImmobilierRepository) {
        this.userRepository = userRepository;
        this.bienImmobilierRepository = bienImmobilierRepository;
    }

    public Postuler toPostuler(PostulerCreateDTO dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));

        BienImmobilier bienImmobilier = bienImmobilierRepository.findById(dto.getBienImmobilierId())
                .orElseThrow(() -> new RuntimeException("Bien immobilier non trouvé"));

        return new Postuler(user, bienImmobilier, LocalDateTime.now());
    }

    public PostulerDTO toPostulerDTO(Postuler postuler) {
        PostulerDTO dto = new PostulerDTO();
        dto.setDatePostule(postuler.getDatePostule());

        if (postuler.getUser() != null) {
            dto.setUserId(postuler.getUser().getIduser());
        }

        if (postuler.getBienImmobilier() != null) {
            dto.setBienImmobilierId(postuler.getBienImmobilier().getIdbien());
        }

        return dto;
    }
}