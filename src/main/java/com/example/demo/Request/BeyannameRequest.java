package com.example.demo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class BeyannameRequest {
    public Integer id;
    public String tescil_id;
    @JsonFormat(pattern="yyyy-MM-dd")
    public LocalDate tarih;

    public Integer alıcı_firma;
    public Integer gonderici_firma;
    public Integer cikis_gumruk;
    public Integer varis_gümrük;
    public Integer urun_id;
    public Integer tasiyici_arac;
}
