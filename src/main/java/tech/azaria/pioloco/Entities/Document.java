/**
 * pour representer les documents qui concernent un bien immobilier en particulier
 */

package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@AllArgsConstructor
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_document;

    @Column(nullable = false)
    private String nom;  // bon doit correspondre au nom du fichier ou pas bref ofn va reflechir

    @Column(nullable = false)
    private String url;   // Chemin du fichier

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idbien", nullable = false)
    @ToString.Exclude
    private BienImmobilier bienImmobilier;

    public Document(){

    }

    public Long getId_document() {
        return id_document;
    }

    public void setId_document(Long id_document) {
        this.id_document = id_document;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BienImmobilier getBienImmobilier() {
        return bienImmobilier;
    }

    public void setBienImmobilier(BienImmobilier bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }
}