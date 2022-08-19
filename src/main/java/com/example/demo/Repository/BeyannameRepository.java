package com.example.demo.Repository;

import com.example.demo.Entity.Beyanname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeyannameRepository extends JpaRepository<Beyanname,Integer> {
}
