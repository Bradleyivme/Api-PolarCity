package com.example.demo.service;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;

import java.util.List;

public interface ProductoService {
    public List<Producto> listarProductos();
    public Producto buscarporId(long idProducto);
    public void crearProducto(Producto producto);
    public void modificarProducto(long idProducto, Producto producto);
    public void borrarProducto(long idProducto);
}

