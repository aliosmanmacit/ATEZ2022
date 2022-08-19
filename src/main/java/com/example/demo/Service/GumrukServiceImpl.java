package com.example.demo.Service;


import com.example.demo.Repository.GumrukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Entity.Gumruk;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class GumrukServiceImpl implements GumrukService{


    @Autowired
    GumrukRepository gumrukRepository;

    @Override
    public Optional<Gumruk> findById(Integer id) {
        return gumrukRepository.findById(id);
    }


}
