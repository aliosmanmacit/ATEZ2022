package com.example.demo.Service;


import com.example.demo.Entity.Urun;

import java.util.Optional;

public interface UrunService
{
    Optional<Urun> findById(Integer id);
}
