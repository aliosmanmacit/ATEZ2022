package com.example.demo.Service;

import com.example.demo.Entity.Firma;
import com.example.demo.Repository.AdresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Adres;

import java.util.Optional;

@Service
public class AdresServiceImpl implements AdresService{
    @Autowired
    AdresRepository adresRepository;
    public Optional<Adres> findById(Integer id) {
        return adresRepository.findById(id);
    }

}
