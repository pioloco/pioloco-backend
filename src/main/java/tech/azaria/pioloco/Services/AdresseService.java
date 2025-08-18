package tech.azaria.pioloco.Services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Entities.Adresse;
import tech.azaria.pioloco.Repositories.AdresseRepository;

@Service
public class AdresseService {
    private final AdresseRepository adresseRepository;
    private final BienImmobilierService bienImmobilierService;

    public AdresseService( BienImmobilierService bienImmobilierService,AdresseRepository adresseRepository){
        this.adresseRepository=adresseRepository;
        this.bienImmobilierService=bienImmobilierService;
    }

    @Transactional
    public  Adresse createrAdresse(Adresse adresse){
       return adresseRepository.save(adresse);
    }
    @Transactional
    public void deleteAdresse(Adresse adresse){
        adresseRepository.delete(adresse);
    }
}
