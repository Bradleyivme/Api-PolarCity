package com.example.demo.DAO;

import com.example.demo.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<Producto, Long> {
    public Producto FindByCode(String codigo);
}
