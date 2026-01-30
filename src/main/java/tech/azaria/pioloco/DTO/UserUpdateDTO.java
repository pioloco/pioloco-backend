package tech.azaria.pioloco.DTO;

import lombok.Data;

/**
 * DTO utilise pour mettre a jour un utilisateur.
 * Ne contient pas le mot de passe (gerer dans un DTO separe si necessaire).
 */
public class UserUpdateDTO {
    private String nom;
    private String prenom;
    private String telephone;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}