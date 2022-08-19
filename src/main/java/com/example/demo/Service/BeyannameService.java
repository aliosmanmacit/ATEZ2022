package com.example.demo.Service;


import com.example.demo.Entity.Beyanname;
import com.example.demo.Entity.Firma;

import java.util.List;
import java.util.Optional;


public interface BeyannameService {
    List<Beyanname> listBeyanname();
    Optional<Firma> findById(Integer id);
}
