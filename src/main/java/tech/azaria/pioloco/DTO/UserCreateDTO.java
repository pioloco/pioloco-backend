package tech.azaria.pioloco.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import tech.azaria.pioloco.Entities.enums.Role;

import java.util.List;

/**
 * DTO utilise pour la creation d un utilisateur.
 * Contient le mot de passe.
 */
@Data
public class UserCreateDTO {
    @NotBlank(message = "le nom ne doit pas etre vide")
    @Size(min = 2, max = 50, message = "le nom doit contenir entre 2 et 50 caracteres")
    private String nom;

    @NotBlank(message = "le prenom est obligatoire")
    @Size(min = 2, max = 50, message = "le prenom doit contenir entre 2 et 50 caracteres")
    private String prenom;

    @NotBlank(message = "l adresse mail ne doit pas etre vide")
    @Email
    private String email;

    @NotBlank(message = "le role ne doit pas etre vide")
    private Role role;

    @NotBlank(message = "le numero de telephone ne doit pas etre vide")
    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$", message = "le numero de telephone doit etre valide")
    private String telephone;

    @NotBlank(message = "le mot de passe est obligatoire")
    @Size(min = 8, message = "le mot de passe doit contenir au moins 8 caracteres")
    private String password;

    private List<Long> publicationIds;
    private List<Long> postulerIds;
}