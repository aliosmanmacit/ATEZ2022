package com.example.demo.Repository;

import com.example.demo.Entity.Arac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AracJPARepository extends CrudRepository<Arac, Integer> {

}
