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

    public @NotBlank(message = "le nom ne doit pas etre vide") @Size(min = 2, max = 50, message = "le nom doit contenir entre 2 et 50 caracteres") String getNom() {
        return nom;
    }

    public void setNom(@NotBlank(message = "le nom ne doit pas etre vide") @Size(min = 2, max = 50, message = "le nom doit contenir entre 2 et 50 caracteres") String nom) {
        this.nom = nom;
    }

    public @NotBlank(message = "le prenom est obligatoire") @Size(min = 2, max = 50, message = "le prenom doit contenir entre 2 et 50 caracteres") String getPrenom() {
        return prenom;
    }

    public void setPrenom(@NotBlank(message = "le prenom est obligatoire") @Size(min = 2, max = 50, message = "le prenom doit contenir entre 2 et 50 caracteres") String prenom) {
        this.prenom = prenom;
    }

    public @NotBlank(message = "l adresse mail ne doit pas etre vide") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "l adresse mail ne doit pas etre vide") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "le role ne doit pas etre vide") Role getRole() {
        return role;
    }

    public void setRole(@NotBlank(message = "le role ne doit pas etre vide") Role role) {
        this.role = role;
    }

    public @NotBlank(message = "le numero de telephone ne doit pas etre vide") @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$", message = "le numero de telephone doit etre valide") String getTelephone() {
        return telephone;
    }

    public void setTelephone(@NotBlank(message = "le numero de telephone ne doit pas etre vide") @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$", message = "le numero de telephone doit etre valide") String telephone) {
        this.telephone = telephone;
    }

    public @NotBlank(message = "le mot de passe est obligatoire") @Size(min = 8, message = "le mot de passe doit contenir au moins 8 caracteres") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "le mot de passe est obligatoire") @Size(min = 8, message = "le mot de passe doit contenir au moins 8 caracteres") String password) {
        this.password = password;
    }

    public List<Long> getPublicationIds() {
        return publicationIds;
    }

    public void setPublicationIds(List<Long> publicationIds) {
        this.publicationIds = publicationIds;
    }

    public List<Long> getPostulerIds() {
        return postulerIds;
    }

    public void setPostulerIds(List<Long> postulerIds) {
        this.postulerIds = postulerIds;
    }
}