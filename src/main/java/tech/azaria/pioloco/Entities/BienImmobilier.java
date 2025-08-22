/**
 * pour representer un bien immobilier avec toute ses caracteristiques
 */

package tech.azaria.pioloco.Entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import tech.azaria.pioloco.Entities.Categorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import tech.azaria.pioloco.Entities.enums.Statut;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
public class BienImmobilier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbien;
    @Column(name = "nombrePiece") // peut etre vide si jamsis il s'agit d'un terrain comme bien
    private int nombrePiece;

    @Column(nullable = false)
    @NotBlank(message = "ce champ ne doit pas etre vide")
    @Positive
    private double superficie;
    @Column(nullable = false,name = "prix")
    @Positive
    @NotBlank(message = "ce champ ne doit pas etre vide")
    private double prix;
    @OneToMany(mappedBy = "bienImmobilier", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<Image> images;

    @OneToMany(mappedBy = "bienImmobilier", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<Document> documents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcategorie", nullable = false)
    private Categorie categorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadresse", nullable = false)
    private Adresse adresse;

    @Column(name = "description",nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private Statut status; //disponible,reserver,vendu

    public BienImmobilier() {
        this.images = new HashSet<>();
        this.documents = new HashSet<>();
    }
}