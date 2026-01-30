/**
 * pour representer un utilisateur du site
 */
package tech.azaria.pioloco.Entities;

import com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import tech.azaria.pioloco.Entities.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@AllArgsConstructor
@Table(name = "users")
public class User implements UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;

    @Column(nullable = false,length = 100)
    private String nom;

    @Column(nullable = false,length = 100)
    private String prenom;

    @Column(nullable = false, unique = true,length = 100)
    private String email;

    @Column(nullable = false,length = 100)
   private String telephone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    @Size(min = 8,message = "le mot de passe doit contenir au moins 8 caracteres")
    @Column(name = "password",nullable = false)
    private String password;

    private boolean actif=false;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Postuler> postulers;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Credit> credits;

    public User() {

        this.postulers = new ArrayList<>();
        this.role=Role.CLIENT; // bon par defaut ein
        this.credits= new ArrayList<>();
    }
    public int  TotalCredit(){
        return  credits.stream().mapToInt(Credit ::getNombreCredit).sum();
    }

    @Override
    public boolean isEnabled() {
        return this.actif;
    }
    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return actif;
    }

    @Override
    public boolean isAccountNonLocked() {
        return actif;
    }

    @Override
    public boolean isAccountNonExpired() {
        return actif;
    }

    @Override
    public String getUsername() {
        return email ;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities=new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE"+this.role.name()));
        return authorities;
    }

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

    public void setPassword(@Size(min = 8, message = "le mot de passe doit contenir au moins 8 caracteres") String password) {
        this.password = password;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public List<Postuler> getPostulers() {
        return postulers;
    }

    public void setPostulers(List<Postuler> postulers) {
        this.postulers = postulers;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}