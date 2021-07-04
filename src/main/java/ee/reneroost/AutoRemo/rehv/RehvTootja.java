package ee.reneroost.AutoRemo.rehv;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RehvTootja")
@Table(name = "rehv_tootja")
public class RehvTootja {


    @Id
    @SequenceGenerator(
            name = "rehv_tootja_sequence",
            sequenceName = "rehv_tootja_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rehv_tootja_sequence")
    @Column(name = "id", updatable = false)
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @OneToMany(
            mappedBy = "rehvTootja",
            cascade = {CascadeType.PERSIST},
            fetch = FetchType.EAGER
    )
    private Set<RehvMudel> rehvMudelSet;

    @NotNull
    @Column(name = "nimi", columnDefinition = "TEXT")
    private String nimi;

    @Column(name = "riik", columnDefinition = "TEXT")
    private String riik;

    @Column(name = "tutvustus", columnDefinition = "TEXT")
    private String tutvustus;

}
