package com.example.demo.Service;


import com.example.demo.Entity.Firma;

import java.util.Optional;

public interface FirmaService {

    Optional<Firma> findById(Integer id);

}
