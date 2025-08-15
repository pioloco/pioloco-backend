package tech.azaria.pioloco.Services;

import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tech.azaria.pioloco.Entities.Publication;
import tech.azaria.pioloco.Entities.User;
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
    // Rechercher l'auteur d'une publication
    public User AuteurPublication(Publication publication){
        return publication.getUser();
    }
    // Rechercher les publication d'un user en particularite
    public List<Publication> ListePublicationDe(String nom ,String prenom){
        User user=userService.getUserParNomPrenom(nom,prenom);
        Long iduser=user.getIduser();
       return publicationRepository.findByUserId(iduser);
    }
    public void SupprimerPublication(Publication publication){
        publicationRepository.delete(publication);
    }
    // rechercher les publication d'un type precis ( location ou vente )
    public List<Publication> getPublicationParType(String typepub){
        return publicationRepository.findByTypePublication(typepub);
    }
    // liste des publication en dessous d'un certain prix
    public List<Publication> publicationsSousPrix(double prix){
        return publicationRepository.PublicationParPrix(prix);
    }


}
