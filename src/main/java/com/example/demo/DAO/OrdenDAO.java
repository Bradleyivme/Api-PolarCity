package com.example.demo.DAO;

import com.example.demo.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenDAO extends JpaRepository<Orden, Long> {
}
