package tech.azaria.pioloco.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Idpostule implements Serializable {
    private Long idbien;
    private Long iduser;

    public Idpostule() {}

    public Idpostule(Long idBien, Long idUser) {
        this.idbien = idBien;
        this.iduser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idpostule that = (Idpostule) o;
        return Objects.equals(idbien, that.idbien) &&
                Objects.equals(iduser, that.iduser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idbien, iduser);
    }
}