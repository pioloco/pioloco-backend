package tech.azaria.pioloco.Entities;

import CODE_DEV_INF.piolko.Entities.enums.TypePublication;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@IdClass(PublicationId.class)
@AllArgsConstructor
public class Publication {
    @Id
    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "idbien")
    private BienImmobilier bienImmobilier;
    private LocalDateTime datepublication;
    private String statut;
    private TypePublication typePublication;
    
}
