package com.example.demo.Service;


import com.example.demo.Entity.Arac;
import com.example.demo.Repository.AracJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service


public class AracServiceImpl implements AracService{


    @Autowired
    AracJPARepository aracRepository;


    @Override
    public Optional<Arac> findById(Integer id) {
        return aracRepository.findById(id);
    }










}
