package com.example.demo.controller;


import com.example.demo.model.entity.Adres;
import com.example.demo.service.AdresServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/adreses")
public class AdresController {

    @Autowired
    private AdresServiceImpl adresService;


    @PostMapping()
    public Adres saveAdres(@RequestBody Adres adres){
        return adresService.save(adres);
    }


}
