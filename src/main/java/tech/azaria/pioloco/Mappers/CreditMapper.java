package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.CreditCreateDTO;
import tech.azaria.pioloco.DTO.CreditDTO;
import tech.azaria.pioloco.Entities.Credit;
import java.time.LocalDateTime;

@Component
public class CreditMapper {

    public Credit toCredit(CreditCreateDTO dto) {
        Credit credit = new Credit();
        credit.setDateDebut(LocalDateTime.now());
        credit.setDateFin(dto.getDateFin());
        credit.setNombreCredit(dto.getNombreCredits());
        credit.setMontant(dto.getNombreCredits() * 10.0); // Exemple: 10€ par crédit
        return credit;
    }

    public CreditDTO toCreditDTO(Credit credit) {
        CreditDTO dto = new CreditDTO();
        dto.setIdCredit(credit.getIdcredit());
        dto.setDateDebut(credit.getDateDebut());
        dto.setDateFin(credit.getDateFin());
        dto.setNombreCredits(credit.getNombreCredit());
        dto.setMontant(credit.getMontant());

        if (credit.getUser() != null) {
            dto.setIdUser(credit.getUser().getIduser());
        }

        return dto;
    }
}