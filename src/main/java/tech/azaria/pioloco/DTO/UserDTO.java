package tech.azaria.pioloco.DTO;

import lombok.Data;
import tech.azaria.pioloco.Entities.enums.Role;

import java.util.List;

/**
 * DTO utilise pour exposer un utilisateur sans mot de passe.
 */
@Data
public class UserDTO {
    private Long iduser;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private Role role;
    private List<Long> postulerIds;
    private List<Long> creditIds;
    private int totalCredits;
}