package ee.reneroost.AutoRemo.laoseis;


import ee.reneroost.AutoRemo.rehv.RehvMudel;
import ee.reneroost.AutoRemo.tookoda.Tookoda;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Laoseis")
@Table(name = "laoseis")
public class Laoseis {

    @EmbeddedId
    @Setter(AccessLevel.PRIVATE)
    private LaoseisId id;

    @ManyToOne
    @MapsId("rehvId")
    @JoinColumn(
            name = "rehv_id",
            foreignKey = @ForeignKey(name = "fk_laoseis_rehv_mudel")
    )
    private RehvMudel rehvMudel;

    @ManyToOne
    @MapsId("tookodaId")
    @JoinColumn(
            name = "tookodaId",
            foreignKey = @ForeignKey(name = "fk_laoseis_tookoda")
    )
    private Tookoda tookoda;

    @Column(name = "kogus", columnDefinition = "INTEGER")
    private int kogus;
}
