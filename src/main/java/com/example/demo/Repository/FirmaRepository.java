package com.example.demo.Repository;

import com.example.demo.Entity.Firma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FirmaRepository extends JpaRepository<Firma,Integer> {
}
