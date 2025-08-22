/**
 * pour representer une offre qui concerne un bien immobilier
 */
package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Entity
@IdClass(Idpostule.class)
@Data
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Postuler {
    @Id
    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "idbien")
    private BienImmobilier bienImmobilier;
    @CreatedDate
    LocalDateTime datePostule;
}
