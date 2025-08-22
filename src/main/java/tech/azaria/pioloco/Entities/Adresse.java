/**
 * Represente unne adresse assoiciee a un bien immobilier
 */

package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@Table(name = "adresses")
public class Adresse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idadresse;

    @Column(nullable = false)
    @NotBlank(message = " la region ne doit pas etre vide")
    private String region;

    @Column(nullable = false)
    @NotBlank(message = " la ville ne doit pas etre vide")
    private String ville;

    private String localisation;

    @OneToMany(mappedBy = "adresse", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<BienImmobilier> bienImmobiliers;

    public Adresse() {
        this.bienImmobiliers = new ArrayList<>();
    }

    public void addBienImmobilier(BienImmobilier bien) {
        if (!bienImmobiliers.contains(bien)) {
            bienImmobiliers.add(bien);
            bien.setAdresse(this);
        }
    }

    public void removeBienImmobilier(BienImmobilier bien) {
        bienImmobiliers.remove(bien);
        bien.setAdresse(null);
    }
}