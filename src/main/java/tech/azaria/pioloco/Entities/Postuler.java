package tech.azaria.pioloco.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@IdClass(Idpostule.class)
public class Postuler {
    @Id
    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "idbien")
    private BienImmobilier bienImmobilier;

}
