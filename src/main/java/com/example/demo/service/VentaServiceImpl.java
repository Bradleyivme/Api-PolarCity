package com.example.demo.service;

import com.example.demo.DAO.VentaDAO;
import com.example.demo.entities.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    VentaDAO ventaDAO;

    @Override
    public List<Venta> listarVentas() {
        return (List<Venta>) ventaDAO.findAll();
    }

    @Override
    public void CrearVenta(Venta venta) {
        ventaDAO.save(venta);
    }


}
