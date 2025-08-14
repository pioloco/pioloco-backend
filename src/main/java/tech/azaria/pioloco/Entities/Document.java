package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}