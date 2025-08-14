package tech.azaria.pioloco.Services;

import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Repositories.AdresseRepository;

@Service
public class AdresseService {
    private final AdresseRepository adresseRepository;
    private final BienImmobilierService bienImmobilierService;

    public AdresseService( BienImmobilierService bienImmobilierService,AdresseRepository adresseRepository){
        this.adresseRepository=adresseRepository;
        this.bienImmobilierService=bienImmobilierService;
    }

}
