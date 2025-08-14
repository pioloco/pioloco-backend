package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_image;

    @Column(nullable = false)
    private String url;  // chemin d'acces

    private String nomImage;  // unpeu comme cuisine ,salon,douche...

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idbien", nullable = false)
    @ToString.Exclude
    private BienImmobilier bienImmobilier;

    public Image(){}
}