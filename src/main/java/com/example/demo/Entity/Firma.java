package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Firma")
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Firma {

    @OneToMany
    @JoinColumn(name = "id")
    @ToString.Exclude
    @JsonManagedReference
    private Set<Beyanname> beyanname;

    @OneToMany
    @JoinColumn(name = "id")
    @ToString.Exclude
    @JsonManagedReference
    private Set<Beyanname> beyanname2;

    @OneToMany
    @JoinColumn(name="id")
    @ToString.Exclude
    @JsonManagedReference
    private Set<Arac> arac;
    @OneToOne
    @JoinColumn(name = "gonderici_adres")
    @JsonBackReference
    private Adres adres;
    @OneToOne
    @JoinColumn(name = "alici_adres")
    @JsonBackReference
    private Adres adres2;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Integer id;
    @Column(name = "firma_ad")
    private String firma_ad;
    @Column(name = "vergi_numarası")
    private String vergi_numarası;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Firma firma = (Firma) o;
        return id != null && Objects.equals(id, firma.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
