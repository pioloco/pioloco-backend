/**
 * pour representer une offre qui concerne un bien immobilier
 */
package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Postuler {

    @EmbeddedId
    private Idpostule id;

    @ManyToOne
    @MapsId("iduser") // Correspond au nom dans Idpostule
    @JoinColumn(name = "iduser")
    private User user;

    @ManyToOne
    @MapsId("idbien") // Correspond au nom dans Idpostule
    @JoinColumn(name = "idbien")
    private BienImmobilier bienImmobilier;

    @Column(name = "datePostule", nullable = false)
    private LocalDateTime datePostule = LocalDateTime.now();

    public Postuler(User user, BienImmobilier bienImmobilier, LocalDateTime datePostule) {
        this.user = user;
        this.bienImmobilier = bienImmobilier;
        this.datePostule = datePostule;
        this.id = new Idpostule(bienImmobilier.getIdbien(), user.getIduser());
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BienImmobilier getBienImmobilier() {
        return bienImmobilier;
    }

    public void setBienImmobilier(BienImmobilier bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }

    public LocalDateTime getDatePostule() {
        return datePostule;
    }

    public void setDatePostule(LocalDateTime datePostule) {
        this.datePostule = datePostule;
    }
}
