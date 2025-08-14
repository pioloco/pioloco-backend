package tech.azaria.pioloco.Services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tech.azaria.pioloco.Entities.Publication;
import tech.azaria.pioloco.Repositories.AdresseRepository;
import tech.azaria.pioloco.Repositories.PublicationRepository;


import java.time.LocalDateTime;
import java.util.List;
@Service
public class PublicationService {

    private final PublicationRepository publicationRepository;
    private final BienImmobilierService bienImmobilierService;
   private final UserService userService;

    public PublicationService(PublicationRepository publicationRepository,BienImmobilierService bienImmobilierService,UserService userService) {
        this.publicationRepository = publicationRepository;
        this.bienImmobilierService=bienImmobilierService;
        this.userService=userService;

    }
    public Publication createPublication(Publication publication) {
        publication.setDatepublication(LocalDateTime.now());
        return publicationRepository.save(publication);
    }
    public List<Publication> PublicationsParVille(String ville) {
        return publicationRepository.findByVille(ville);
    }

    public List<Publication> PublicationsParRegion(String region) {
        return publicationRepository.findByRegion(region);
    }


}
