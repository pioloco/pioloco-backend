package tech.azaria.pioloco.Entities;

import java.io.Serializable;
import java.util.Objects;

public class PublicationId implements Serializable {
    private Long iduser;
    private Long idbien;

    public PublicationId() {}

    public PublicationId(Long idUser, Long idBien) {
        this.iduser = idUser;
        this.idbien = idBien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicationId that = (PublicationId) o;
        return Objects.equals(iduser, that.iduser) && Objects.equals(idbien, that.idbien);
    }
    @Override
    public int hashCode() {
        return Objects.hash(iduser, idbien);
    }
}