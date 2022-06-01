package com.example.demo.service;

import com.example.demo.entities.Usuario;
import com.example.demo.entities.Venta;

import java.util.List;



public interface VentaService {
    public List<Venta> listarVentas();
    public void CrearVenta(Venta venta);


}
