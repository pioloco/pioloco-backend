package tech.azaria.pioloco.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PublicationId implements Serializable {

    @Column(name = "iduser")
    private Long iduser;

    @Column(name = "idbien")
    private Long idbien;

    public PublicationId() {}

    public PublicationId(Long iduser, Long idbien) {
        this.iduser = iduser;
        this.idbien = idbien;
    }

    // getters et setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicationId)) return false;
        PublicationId that = (PublicationId) o;
        return Objects.equals(iduser, that.iduser) && Objects.equals(idbien, that.idbien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, idbien);
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public Long getIdbien() {
        return idbien;
    }

    public void setIdbien(Long idbien) {
        this.idbien = idbien;
    }
}
