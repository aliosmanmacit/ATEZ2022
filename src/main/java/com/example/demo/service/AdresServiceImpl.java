package com.example.demo.service;


import com.example.demo.model.entity.Adres;
import com.example.demo.repository.AdresJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdresServiceImpl {

    private final AdresJPARepository adresJPARepository;

    public Adres save(Adres adres){
       return adresJPARepository.save(adres);
    }

}
