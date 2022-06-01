package com.example.demo.service;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;

import java.util.List;

public interface ProductoService {
    public List<Producto> listarProductos();
    public Producto buscarporId(long id);
    public void crearProducto(Producto producto);
    public void modificarProducto(long id, Producto producto);
    public void borrarProducto(long id);
}
