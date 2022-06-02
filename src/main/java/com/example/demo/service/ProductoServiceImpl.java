package com.example.demo.service;

import com.example.demo.DAO.ProductoDAO;
import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;
import com.example.demo.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoDAO productoDAO;

    @Override
    public List<Producto> listarProductos() {
        return (List<Producto>) productoDAO.findAll();
    }

    @Override
    public Producto buscarporId(long idProducto) {
        Optional<Producto> OPproducto = productoDAO.findById(idProducto);

        if(OPproducto.isPresent()) {
            return OPproducto.get();

        }else {

            throw new NotFoundException("Producto no existe");
        }
    }


    @Override
    public void crearProducto(Producto producto) {
        productoDAO.save(producto);

    }

    @Override
    public void modificarProducto(long idProducto, Producto producto) {
        if(productoDAO.existsById(idProducto)){
            producto.setIdProducto(idProducto);
            productoDAO.save(producto);
        }else {

            throw new NotFoundException("Producto no encontrado");
        }

    }

    @Override
    public void borrarProducto(long idProducto) {
        if(productoDAO.existsById(idProducto)) {
            productoDAO.deleteById(idProducto);

        }else {

            throw new NotFoundException("Producto no encontrado");
        }

    }
}
