package com.example.demo.service;

import com.example.demo.entities.Factura;
import com.example.demo.entities.Orden;

import java.util.List;

public interface FacturaService {
    public List<Factura> listarFacturas();
    public void crearFactura(Factura factura);
}
