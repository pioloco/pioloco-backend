/**
 * pour representer les differntes categories de bien immobilier
 */
package tech.azaria.pioloco.Entities;

import tech.azaria.pioloco.Entities.enums.NomCategorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
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
}