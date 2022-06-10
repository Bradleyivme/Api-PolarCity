package com.example.demo.service;

import com.example.demo.DAO.FacturaDAO;
import com.example.demo.entities.Factura;
import com.example.demo.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired
    FacturaDAO facturaDAO;



    @Override
    public List<Factura> listarFacturas() {
        return (List<Factura>) facturaDAO.findAll();
    }

    @Override
    public void crearFactura(Factura factura) {
        facturaDAO.save(factura);

    }
}
