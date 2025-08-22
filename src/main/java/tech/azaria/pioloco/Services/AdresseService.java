package tech.azaria.pioloco.Services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.azaria.pioloco.DTO.AdresseCreateDTO;
import tech.azaria.pioloco.DTO.AdresseDTO;
import tech.azaria.pioloco.Entities.Adresse;
import tech.azaria.pioloco.Repositories.AdresseRepository;

@Service
@AllArgsConstructor
public class AdresseService {
    private final AdresseRepository adresseRepository;
    private final BienImmobilierService bienImmobilierService;

    public AdresseDTO createAdresse(AdresseCreateDTO adresse){
        Adresse adr=new Adresse();
        adr.setRegion(adresse.getRegion());
        adr.setVille(adresse.getVille());
        adr.setLocalisation(adresse.getLocalisation());
        Adresse saved=adresseRepository.save(adr);

        AdresseDTO adresseDTO=new AdresseDTO();
        adresseDTO.setIdadresse(saved.getIdadresse());
        adresseDTO.setRegion(saved.getRegion());
        adresseDTO.setVille(saved.getVille());
        adresseDTO.setLocalisation(saved.getLocalisation());
        return adresseDTO;

    }
    public AdresseDTO AdresseParId(Long id){
        Adresse adresse=adresseRepository.findAdresseById(id).orElseThrow(() ->new RuntimeException("Adresse introuvable !!"));
        AdresseDTO dto=new AdresseDTO();
        dto.setIdadresse(adresse.getIdadresse());
        dto.setRegion(adresse.getRegion());
        dto.setVille(adresse.getVille());
        dto.setLocalisation(adresse.getLocalisation());
        return dto;
    }



}
