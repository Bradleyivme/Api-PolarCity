package com.example.demo.service;

import com.example.demo.entities.Orden;


import java.util.List;

public interface OrdenService {

    public List<Orden> listarOrdenes();
    public Orden buscarporId(long idOrden);
    public void crearOrden(Orden orden);
    public void modificarOrden(long idOrden, Orden orden);
    public void borrarOrden(long idOrden);
}
