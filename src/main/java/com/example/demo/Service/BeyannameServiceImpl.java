package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.BeyannameRepository;
import com.example.demo.Repository.FirmaRepository;
import com.example.demo.Request.BeyannameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service


public class BeyannameServiceImpl implements BeyannameService{
    @Autowired
    FirmaRepository firmaRepository;
    @Autowired
    BeyannameRepository beyannameRepository;

    @Autowired
    FirmaServiceImpl firmaService;

    @Autowired
    AdresServiceImpl adresService;

    @Autowired
    AracServiceImpl aracService;

    @Autowired
    UrunServiceImpl urunService;

    @Autowired
    GumrukServiceImpl gumrukService;

    @Override
    public List<Beyanname> listBeyanname() {
        return (List<Beyanname>) beyannameRepository.findAll();
    }

    @Override
    public Optional<Firma> findById(Integer id) {
        return firmaRepository.findById(id);
    }
    public Beyanname save(Beyanname beyanname){
        return beyannameRepository.save(beyanname);
    }

    public Beyanname addBeyanname(BeyannameRequest beyannameRequest)
    {

        Beyanname beyanname=new Beyanname();
        beyanname.setTescil_id(beyannameRequest.tescil_id);
        beyanname.setTarih(beyannameRequest.tarih);
        Optional<Gumruk> cikis_gumruk=gumrukService.findById(beyannameRequest.cikis_gumruk.getId());
        Optional<Gumruk> varis_gumruk=gumrukService.findById(beyannameRequest.varis_gümrük.getId());
        Optional<Arac> tasiyici_arac=aracService.findById(beyannameRequest.tasiyici_arac.getId());
        Optional<Firma> gonderici_firma=firmaService.findById(beyannameRequest.gonderici_firma.getId());
        Optional<Firma> alici_firma=firmaService.findById(beyannameRequest.alıcı_firma.getId());
        Optional<Urun> urun=urunService.findById(beyannameRequest.urun.getId());
        beyanname.setUrun(urun.get());
        beyanname.setCikis_gumruk(cikis_gumruk.get());
        beyanname.setVaris_gumruk(varis_gumruk.get());
        beyanname.setArac(tasiyici_arac.get());
        beyanname.setAlici_firma(alici_firma.get());
        beyanname.setGonderici_firma(gonderici_firma.get());





        return beyannameRepository.save(beyanname);








    }


}
