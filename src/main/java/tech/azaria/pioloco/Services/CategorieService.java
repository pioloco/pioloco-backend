package tech.azaria.pioloco.Services;

import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Entities.Categorie;
import tech.azaria.pioloco.Repositories.CategoryRepository;

@Service
public class CategorieService {
    private final CategoryRepository categoryRepository;
    private final BienImmobilierService bienImmobilierService;

    public CategorieService(CategoryRepository categoryRepository,BienImmobilierService bienImmobilierService){
        this.bienImmobilierService=bienImmobilierService;
        this.categoryRepository=categoryRepository;
    }
    public Categorie CreateCategorie(Categorie categorie){
        return categoryRepository.save(categorie);
    }
    public void deleteCategorie(String nom){
       Categorie categorie=categoryRepository.findByNom(nom);
       categoryRepository.delete(categorie);
    }
}
