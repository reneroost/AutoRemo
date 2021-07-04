package ee.reneroost.AutoRemo.rehv;

import com.sun.istack.NotNull;
import ee.reneroost.AutoRemo.laoseis.Laoseis;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RehvMudel")
@Table(name = "rehv_mudel")
public class RehvMudel {

    @Id
    @SequenceGenerator(
            name = "rehv_mudel_sequence",
            sequenceName = "rehv_mudel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rehv_mudel_sequence")
    @Column(name = "id", updatable = false)
    @Setter(AccessLevel.PRIVATE)
    private Long id;

    @ManyToOne
    @NotNull
    @JoinColumn(
            name = "rehv_tootja_id",
            referencedColumnName ="id",
            foreignKey = @ForeignKey(name = "fk_rehv_mudel_tootja")
    )
    private RehvTootja rehvTootja;

    @OneToMany(
            mappedBy = "rehvMudel",
            cascade = CascadeType.PERSIST
//            fetch = FetchType.EAGER
    )
    private Set<Laoseis> laoseisSet;

    @NotNull
    @Column(name = "rehvi_tyyp", columnDefinition = "TEXT")
    private String rehviTyyp;

    @NotNull
    @Column(name = "soiduki_tyyp", columnDefinition = "TEXT")
    private String soidukiTyyp;

    @NotNull
    @Column(name = "laius", columnDefinition = "INTEGER")
    private int laius;

    @NotNull
    @Column(name = "korgus", columnDefinition = "INTEGER")
    private int korgus;

    @NotNull
    @Column(name = "diameeter", columnDefinition = "INTEGER")
    private int diameeter;

}
