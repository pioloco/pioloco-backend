package tech.azaria.pioloco.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.azaria.pioloco.DTO.CategorieCreateDTO;
import tech.azaria.pioloco.DTO.CategorieDTO;
import tech.azaria.pioloco.Entities.Categorie;
import tech.azaria.pioloco.Repositories.CategoryRepository;

@Service
@AllArgsConstructor
public class CategorieService {
    private final CategoryRepository categoryRepository;
    private final BienImmobilierService bienImmobilierService;



}
