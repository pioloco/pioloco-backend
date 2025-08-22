/**
 * pour representer un credit qui est l'objet qui permet a un user de pouvoir passer du status cleint a agent immobilier et donc de faire des publication
 */

package tech.azaria.pioloco.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class) // gerer les dates
@Data
@AllArgsConstructor
@Table(name = "credits")
public class Credit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcredit;
    @Column(name = "dateDebut",nullable = false)
    @CreatedDate
    private LocalDateTime dateDebut;
    @Column(name = "dateFin",nullable = false)
    private LocalDateTime dateFin;
    @Column(name = "nombreCredit",nullable = false)
    private int nombreCredit;
    @Column(name = "Montant",nullable = false)
    private double Montant;

    @ManyToOne
    @JoinColumn(name = "iduser")
    @ToString.Exclude
    private User user;

    public Credit(){
        this.nombreCredit =0; // par defaut
        this.Montant=0;
    }
    public void addNbreCredit(int nombreCredits){
        this.nombreCredit=this.nombreCredit+nombreCredits;
    }

}