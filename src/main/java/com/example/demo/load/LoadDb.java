package com.example.demo.load;

import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Firma;
import com.example.demo.Entity.Gumruk;
import com.example.demo.Repository.AdresRepository;
import com.example.demo.Repository.AracJPARepository;
import com.example.demo.Repository.FirmaRepository;
import com.example.demo.Repository.GumrukRepository;
import com.example.demo.Service.GumrukService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class LoadDb {

    private final GumrukRepository gumrukRepository;
    private final AracJPARepository aracJPARepository;
    private final FirmaRepository firmaRepository;
    private final AdresRepository adresRepository;


    @EventListener(ApplicationReadyEvent.class)
    public void loadDb(){


        Optional<Gumruk> gumrukOptional = gumrukRepository.findById(1);

        if(! gumrukOptional.isPresent()){
            Gumruk gumruk = new Gumruk();
          /*
            gumruk.setGumruk_ad("ad gumruk");
            gumruk.setGumruk_tip("tim gumruk");
            gumruk.setInt_kod("kod1");


           */
            gumrukRepository.save(gumruk );
        }

        Optional<Adres> adresOptional = adresRepository.findById(1);
        Adres adres = null;
        if(! adresOptional.isPresent()){
            adres = new Adres();
            adres.setIlce("Bakırkoy");
            adres.setSehir("Ist");
            adres.setUlke("TR");

            adres = adresRepository.save(adres);
        }else{
            adres = adresOptional.get();
        }

        Optional<Firma> firmaOptional = firmaRepository.findById(1);
        Firma firma = null;
        if(! firmaOptional.isPresent()){
            firma = new Firma();
            firma.setAdres( adres );
            firma.setFirma_ad("abc");
            firma.setVergi_numarası("123abc");

            firma = firmaRepository.save(firma);
        }else {
            firma = firmaOptional.get();
        }

        Optional<Arac> aracOptional = aracJPARepository.findById(1);

        if(! aracOptional.isPresent()){
            Arac arac = new Arac();
            arac.setArac_tip("arac tipi1");
            arac.setPlaka("34 ygh 123");
            arac.setFirma( firma );

            aracJPARepository.save(arac);
        }

    }

}
