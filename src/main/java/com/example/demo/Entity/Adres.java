package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name="adres")
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ulke;
    private String sehir;
    private String ilce;
    private String detay;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Adres adres = (Adres) o;
        return id != null && Objects.equals(id, adres.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
