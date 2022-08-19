package com.example.demo.Repository;

import com.example.demo.Entity.Gumruk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GumrukRepository extends JpaRepository<Gumruk,Integer> {
}
