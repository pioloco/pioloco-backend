package tech.azaria.pioloco.Entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tech.azaria.pioloco.Entities.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;

    @Column(nullable = false,length = 100)
    private String nom;

    @Column(nullable = false,length = 100)
    private String prenom;

    @Column(nullable = false, unique = true,length = 100)
    @Email
    private String email;

    @Column(nullable = false,length = 100)
    private String telephone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    @NotBlank
    @Size(min = 8)
    @Column(name = "password",nullable = false)
    private String password;

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
        return  credits.stream().mapToInt(Credit ::getNbre_credit).sum();
    }

}