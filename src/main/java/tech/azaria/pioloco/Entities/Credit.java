package tech.azaria.pioloco.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@Table(name = "credits")
public class Credit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcredit;

    private LocalDateTime dateDebut;
    private Date dateFin;
    private int nbre_credit;

    @OneToMany(mappedBy = "credit", fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<User> users;

    public Credit() {
        this.users = new ArrayList<>();
    }
}