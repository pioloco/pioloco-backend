package tech.azaria.pioloco.DTO;

import lombok.Data;

/**
 * DTO utilise pour mettre a jour un utilisateur.
 * Ne contient pas le mot de passe (gerer dans un DTO separe si necessaire).
 */
@Data
public class UserUpdateDTO {
    private String nom;
    private String prenom;
    private String telephone;
}