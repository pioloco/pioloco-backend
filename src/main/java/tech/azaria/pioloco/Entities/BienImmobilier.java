package tech.azaria.pioloco.Entities;

import tech.azaria.pioloco.Entities.Categorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
public class BienImmobilier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbien;
    @Column(name = "nbrPiece")
    private int nbrPiece;

    @Column(nullable = false)
    private double superficie;
    @Column(nullable = false,name = "prix")
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

    @Column(name = "description")
    private String description;

    public BienImmobilier() {
        this.images = new HashSet<>();
        this.documents = new HashSet<>();
    }
}