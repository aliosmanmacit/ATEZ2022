package com.example.demo.Service;

import com.example.demo.Entity.Urun;
import com.example.demo.Repository.UrunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrunServiceImpl implements UrunService{

    @Autowired
    UrunRepository urunRepository;

    @Override
    public Optional<Urun> findById(Integer id) {
        return urunRepository.findById(id);
    }
}
