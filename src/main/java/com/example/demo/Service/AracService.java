package com.example.demo.Service;


import com.example.demo.Entity.Arac;

import java.util.Optional;



public interface AracService {


    Optional<Arac> findById(Integer id);

}
