/**
 * pour repersenter les images associees a un bien immobilier
 */
package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
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

    public Long getId_image() {
        return id_image;
    }

    public void setId_image(Long id_image) {
        this.id_image = id_image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public BienImmobilier getBienImmobilier() {
        return bienImmobilier;
    }

    public void setBienImmobilier(BienImmobilier bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }
}