package com.example.demo.Request;

import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Firma;
import com.example.demo.Entity.Gumruk;
import com.example.demo.Entity.Urun;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.Set;

public class BeyannameRequest {

    public Integer id;
    public String tescil_id;
    @JsonFormat(pattern="yyyy-MM-dd")
    public LocalDate tarih;

    public Firma alıcı_firma;
    public Firma gonderici_firma;
    public Gumruk cikis_gumruk;
    public Gumruk varis_gümrük;
    public Urun urun;
    public Arac tasiyici_arac;
}
