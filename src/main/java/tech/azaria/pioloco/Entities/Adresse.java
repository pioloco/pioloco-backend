package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
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
    private String region;

    @Column(nullable = false)
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