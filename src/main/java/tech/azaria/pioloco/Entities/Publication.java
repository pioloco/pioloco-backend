package tech.azaria.pioloco.Entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import tech.azaria.pioloco.Entities.enums.StatusPublication;
import tech.azaria.pioloco.Entities.enums.TypePublication;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class) // pour une meilleure gestion des dates
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
    @CreatedDate  // pour exiger que ce gens soit automatiquement remplit lors de la creation
    private LocalDateTime datepublication;
    @Enumerated(EnumType.STRING)
    private StatusPublication statut;
    @Enumerated(EnumType.STRING)
    private TypePublication typePublication;
    
}
