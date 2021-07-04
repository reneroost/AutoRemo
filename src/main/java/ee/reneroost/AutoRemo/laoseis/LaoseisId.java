package ee.reneroost.AutoRemo.laoseis;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

//@Data
@Embeddable
public class LaoseisId implements Serializable {

    @Column(name = "tookoda_id")
    private Long tookodaId;

    @Column(name = "rehv_id")
    private Long rehvId;

    public LaoseisId() {
    }

    public LaoseisId(Long tookodaId, Long rehvId) {
        this.tookodaId = tookodaId;
        this.rehvId = rehvId;
    }

    public Long getTookodaId() {
        return tookodaId;
    }

    public void setTookodaId(Long tookodaId) {
        this.tookodaId = tookodaId;
    }

    public Long getRehvId() {
        return rehvId;
    }

    public void setRehvId(Long rehvId) {
        this.rehvId = rehvId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaoseisId laoseisId = (LaoseisId) o;
        return Objects.equals(tookodaId, laoseisId.tookodaId) && Objects.equals(rehvId, laoseisId.rehvId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tookodaId, rehvId);
    }
}
