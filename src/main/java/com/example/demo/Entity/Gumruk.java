package com.example.demo.Entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name ="gumruk")
public class Gumruk {

    @OneToMany
    @JoinColumn(name = "id")
    @ToString.Exclude
    private Set<Beyanname> beyanname;

    @OneToMany
    @JoinColumn(name = "id")
    @ToString.Exclude
    private Set<Beyanname> beyanname2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gumruk_ad;
    private String int_kod;
    private String adres;
    private String gumruk_tip;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Gumruk gumruk = (Gumruk) o;
        return id != null && Objects.equals(id, gumruk.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
