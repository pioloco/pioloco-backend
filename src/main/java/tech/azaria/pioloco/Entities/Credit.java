/**
 * pour representer un credit qui est l'objet qui permet a un user de pouvoir passer du status cleint a agent immobilier et donc de faire des publication
 */

package tech.azaria.pioloco.Entities;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class) // gerer les dates

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

    public Long getIdcredit() {
        return idcredit;
    }

    public void setIdcredit(Long idcredit) {
        this.idcredit = idcredit;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public int getNombreCredit() {
        return nombreCredit;
    }

    public void setNombreCredit(int nombreCredit) {
        this.nombreCredit = nombreCredit;
    }

    public double getMontant() {
        return Montant;
    }

    public void setMontant(double montant) {
        Montant = montant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}