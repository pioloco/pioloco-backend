package tech.azaria.pioloco.DTO;

import lombok.Data;
import tech.azaria.pioloco.Entities.enums.Role;

import java.util.List;

/**
 * DTO utilise pour exposer un utilisateur sans mot de passe.
 */

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
    private boolean actif;

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Long> getPostulerIds() {
        return postulerIds;
    }

    public void setPostulerIds(List<Long> postulerIds) {
        this.postulerIds = postulerIds;
    }

    public List<Long> getCreditIds() {
        return creditIds;
    }

    public void setCreditIds(List<Long> creditIds) {
        this.creditIds = creditIds;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}