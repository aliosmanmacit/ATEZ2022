package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name="Beyanname")

public class Beyanname {




    @ManyToOne
    @JoinColumn(name = "varis_gumruk_id")
    @JsonBackReference
    private Gumruk varis_gumruk;

    @ManyToOne
    @JoinColumn(name = "cikis_gumruk_id")
    @JsonBackReference
    private Gumruk cikis_gumruk;



    @ManyToOne
    @JsonBackReference("urun")
    private Urun urun;








    @ManyToOne
    @JoinColumn(name = "alici_firma_id")
    @JsonBackReference
    private Firma alici_firma;

    @ManyToOne
    @JoinColumn(name = "gonderici_firma_id")
    @JsonBackReference
    private Firma gonderici_firma;




    @ManyToOne
    @JoinColumn(name = "tasiyici_arac_id")
    @JsonBackReference
    private Arac arac;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tescil_id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate tarih;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Beyanname beyanname = (Beyanname) o;
        return id != null && Objects.equals(id, beyanname.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }





}
