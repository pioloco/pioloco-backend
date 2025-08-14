package tech.azaria.pioloco.Services;

import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Repositories.AdresseRepository;
import tech.azaria.pioloco.Repositories.BienImmobilierRepository;
import tech.azaria.pioloco.Repositories.CategoryRepository;


@Service
public class BienImmobilierService {

    private final BienImmobilierRepository bienRepository;
    private final CategoryRepository  categorieRepository;
    private final AdresseRepository adresseRepository;

    public BienImmobilierService(BienImmobilierRepository bienRepository,
                                 CategoryRepository categorieRepository,
                                 AdresseRepository adresseRepository) {
        this.bienRepository = bienRepository;
        this.categorieRepository = categorieRepository;
        this.adresseRepository = adresseRepository;
    }

    public BienImmobilier createBienImmobilier(BienImmobilier bien) {
        // Validation des relations
        if (!adresseRepository.existsById(bien.getAdresse().getIdadresse()) && (!categorieRepository.existsById(bien.getCategorie().getIdcategorie() ))) {
            return bienRepository.save(bien);
        }
        else {
            return bien;
        }


    }
}