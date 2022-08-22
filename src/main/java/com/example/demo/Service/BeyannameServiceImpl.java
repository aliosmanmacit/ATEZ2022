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
        Firma firma=new Firma();
        Firma firma2=new Firma();
        Optional<Firma> alici_firma=firmaService.findById(beyannameRequest.alıcı_firma);
        firma=alici_firma.get();
        Adres adres=firma.getAdres();
        Optional<Adres> alici_firma_adres=adresService.findById(adres.getId());

        Optional<Firma> gonderici_firma=firmaService.findById(beyannameRequest.gonderici_firma);
        firma2=gonderici_firma.get();
        Adres adres2=firma2.getAdres();
        Optional<Adres> gonderici_firma_adres=adresService.findById(adres2.getId());

        Optional<Urun> urun=urunService.findById(beyannameRequest.urun_id);

        Optional<Gumruk> cikis_gumruk=gumrukService.findById(beyannameRequest.cikis_gumruk);

        Optional<Gumruk> varis_gumruk=gumrukService.findById(beyannameRequest.varis_gümrük);

        Optional<Arac> tasiyici_arac=aracService.findById(beyannameRequest.tasiyici_arac);

        /*
        beyanname.setTescil_id(beyannameRequest.tescil_id);
        beyanname.setTarih(beyannameRequest.tarih);
        beyanname.setCikis_gumruk(cikis_gumruk.get());
        beyanname.setVaris_gumruk(varis_gumruk.get());
        beyanname.setArac(tasiyici_arac.get());
        beyanname.setGonderici_firma(firma2);
        beyanname.setAlici_firma(firma);
        beyanname.setUrun(urun.get());
        */


        alici_firma.get().setAdres2(alici_firma_adres.get());
        gonderici_firma.get().setAdres(gonderici_firma_adres.get());



        return beyannameRepository.save(beyanname);








    }


}
