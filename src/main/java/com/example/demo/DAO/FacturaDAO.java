package com.example.demo.DAO;

import com.example.demo.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDAO extends JpaRepository<Factura,Long> {

}
