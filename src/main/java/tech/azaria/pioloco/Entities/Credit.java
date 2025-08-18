package tech.azaria.pioloco.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@EntityListeners(AuditingEntityListener.class) // gerer les dates
@Data
@AllArgsConstructor
@Table(name = "credits")
public class Credit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcredit;
    @CreatedDate
    private LocalDateTime dateDebut;
    private Date dateFin;
    private int nbre_credit;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;

    public Credit(){
        this.nbre_credit=0; // par defaut
    }

}