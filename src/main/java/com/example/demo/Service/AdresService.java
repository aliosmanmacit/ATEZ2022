package com.example.demo.Service;

import com.example.demo.Entity.Adres;

import java.util.Optional;

public interface AdresService {
    Optional<Adres> findById(Integer id);
}
