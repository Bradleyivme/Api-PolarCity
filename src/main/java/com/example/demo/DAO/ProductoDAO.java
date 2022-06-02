package com.example.demo.DAO;

import com.example.demo.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends JpaRepository<Producto, Long> {
}
