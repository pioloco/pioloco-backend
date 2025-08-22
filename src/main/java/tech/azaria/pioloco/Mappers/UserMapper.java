package tech.azaria.pioloco.Mappers;

import org.springframework.stereotype.Component;
import tech.azaria.pioloco.DTO.UserCreateDTO;
import tech.azaria.pioloco.DTO.UserDTO;
import tech.azaria.pioloco.DTO.UserUpdateDTO;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Entities.Credit;
import tech.azaria.pioloco.Entities.Postuler;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toUser(UserCreateDTO dto) {
        User user = new User();
        user.setNom(dto.getNom());
        user.setPrenom(dto.getPrenom());
        user.setEmail(dto.getEmail());
        user.setTelephone(dto.getTelephone());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return user;
    }

    public UserDTO toUserDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setIduser(user.getIduser());
        dto.setNom(user.getNom());
        dto.setPrenom(user.getPrenom());
        dto.setEmail(user.getEmail());
        dto.setTelephone(user.getTelephone());
        dto.setRole(user.getRole());

        if (user.getCredits() != null) {
            dto.setCreditIds(user.getCredits().stream()
                    .map(Credit::getIdcredit)
                    .collect(Collectors.toList()));

            dto.setTotalCredits(user.getCredits().stream()
                    .mapToInt(Credit::getNombreCredit)
                    .sum());
        }

        return dto;
    }

    public void updateUserFromDTO(UserUpdateDTO dto, User user) {
        if (dto.getNom() != null) {
            user.setNom(dto.getNom());
        }
        if (dto.getPrenom() != null) {
            user.setPrenom(dto.getPrenom());
        }
        if (dto.getTelephone() != null) {
            user.setTelephone(dto.getTelephone());
        }
    }
}