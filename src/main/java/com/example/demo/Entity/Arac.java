package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name="Arac")
public class Arac {

    @OneToMany
    @JoinColumn(name = "id")
    @ToString.Exclude
    @JsonManagedReference
    private Set<Beyanname> beyanname;


    @ManyToOne
    @JoinColumn(name = "firma_id")
    @JsonBackReference
    private Firma firma;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String plaka;
    private String arac_tip;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Arac arac = (Arac) o;
        return id != null && Objects.equals(id, arac.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
