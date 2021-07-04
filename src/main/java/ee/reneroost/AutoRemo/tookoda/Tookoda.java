package ee.reneroost.AutoRemo.tookoda;

import com.sun.istack.NotNull;

import ee.reneroost.AutoRemo.laoseis.Laoseis;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Tookoda")
@Table(name = "tookoda")
public class Tookoda {

    @Id
    @SequenceGenerator(
            name = "tookoda_sequence",
            sequenceName = "tookoda_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tookoda_sequence")
    @Column(name = "id", updatable = false)
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @OneToMany(
            mappedBy = "tookoda",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER
    )
    private Set<Laoseis> laoseisSet;

    @NotNull
    @Column(name = "nimi", columnDefinition = "TEXT")
    private String nimi;

    @Column(name = "tanav", columnDefinition = "TEXT")
    private String tanav;

    @NotNull
    @Column(name = "linn", columnDefinition = "TEXT")
    private String linn;

    @Column(name = "posti_indeks", columnDefinition = "INTEGER")
    private int postiIndeks;

}
