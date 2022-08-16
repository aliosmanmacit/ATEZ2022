package com.example.demo.repository;

import com.example.demo.model.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AdresJPARepository extends CrudRepository<Adres, UUID> {
}
