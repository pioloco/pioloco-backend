package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import tech.azaria.pioloco.Entities.enums.StatusPublication;
import tech.azaria.pioloco.Entities.enums.TypePublication;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public class Publication {

    @EmbeddedId
    private PublicationId id;

    @ManyToOne
    @MapsId("iduser")  // correspond au champ 'iduser' dans PublicationId
    @JoinColumn(name = "iduser")
    private User user;

    @ManyToOne
    @MapsId("idbien") // correspond au champ 'idbien' dans PublicationId
    @JoinColumn(name = "idbien")
    private BienImmobilier bienImmobilier;

    @CreatedDate
    private LocalDateTime datepublication;

    @Enumerated(EnumType.STRING)
    private StatusPublication statut;

    @Enumerated(EnumType.STRING)
    private TypePublication typePublication;

    public Publication(User user, BienImmobilier bienImmobilier, LocalDateTime datepublication, StatusPublication statut, TypePublication typePublication) {
        this.user = user;
        this.bienImmobilier = bienImmobilier;
        this.datepublication = datepublication;
        this.statut = statut;
        this.typePublication = typePublication;
        this.id = new PublicationId(user.getIduser(), bienImmobilier.getIdbien());
    }

    // getters et setters pour tous les champs

    public PublicationId getId() {
        return id;
    }

    public void setId(PublicationId id) {
        this.id = id;
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

    public LocalDateTime getDatepublication() {
        return datepublication;
    }

    public void setDatepublication(LocalDateTime datepublication) {
        this.datepublication = datepublication;
    }

    public StatusPublication getStatut() {
        return statut;
    }

    public void setStatut(StatusPublication statut) {
        this.statut = statut;
    }

    public TypePublication getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(TypePublication typePublication) {
        this.typePublication = typePublication;
    }

}
