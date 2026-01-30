/**
 * pour representer les differntes categories de bien immobilier
 */
package tech.azaria.pioloco.Entities;

import tech.azaria.pioloco.Entities.enums.NomCategorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity

@AllArgsConstructor
@Table(name = "categories")
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcategorie;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true)
    private NomCategorie nom;

    private String description;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<BienImmobilier> bienImmobiliers;

    public Categorie() {
        this.bienImmobiliers = new ArrayList<>();
    }

    public void addBienImmobilier(BienImmobilier bien) {
        if (!bienImmobiliers.contains(bien)) {
            bienImmobiliers.add(bien);
            bien.setCategorie(this);
        }
    }

    public void removeBienImmobilier(BienImmobilier bien) {
        bienImmobiliers.remove(bien);
        bien.setCategorie(null);
    }

    public Long getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public NomCategorie getNom() {
        return nom;
    }

    public void setNom(NomCategorie nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BienImmobilier> getBienImmobiliers() {
        return bienImmobiliers;
    }

    public void setBienImmobiliers(List<BienImmobilier> bienImmobiliers) {
        this.bienImmobiliers = bienImmobiliers;
    }
}