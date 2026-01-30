package tech.azaria.pioloco.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Idpostule implements Serializable {

    @Column(name = "idbien")
    private Long idbien;

    @Column(name = "iduser")
    private Long iduser;

    public Idpostule() {}

    public Idpostule(Long idbien, Long iduser) {
        this.idbien = idbien;
        this.iduser = iduser;
    }

    // getters et setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idpostule that = (Idpostule) o;
        return Objects.equals(idbien, that.idbien) && Objects.equals(iduser, that.iduser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idbien, iduser);
    }

    public Long getIdbien() {
        return idbien;
    }
    public void setIdbien(Long idbien) {
        this.idbien = idbien;
    }
    public Long getIduser() {
        return iduser;
    }
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }
}
