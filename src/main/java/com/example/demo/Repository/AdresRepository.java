package com.example.demo.Repository;

import com.example.demo.Entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository


public interface AdresRepository extends JpaRepository<Adres,Integer> {

}
