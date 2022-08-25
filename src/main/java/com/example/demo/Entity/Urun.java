package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "urun")
public class Urun {

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "beyanname_id", foreignKey = @ForeignKey(name = "fk_urun_beyanname"))
    @JsonManagedReference("urun")
    private Set<Beyanname> beyanname;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String urun_ad;
    private String int_kod;
    private Integer brut_agirlik;
    private Integer net_agirlik;
    private Integer mal_bedeli;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Urun urun = (Urun) o;
        return id != null && Objects.equals(id, urun.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
