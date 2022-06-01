package com.example.demo.Controllers;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Usuario;
import com.example.demo.service.ProductoService;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> ListarProducto(){
        return productoService.listarProductos();
    }

    @GetMapping(value = "/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.buscarporId(id); }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearProducto(@Valid @RequestBody Producto producto) {
        productoService.crearProducto(producto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void modificarProducto (@PathVariable Long id, @RequestBody Producto producto) {
        productoService.modificarProducto(id, producto);
    }

    //NO SE PUSO EL CONTROLER DE ELIMINAR YA QUE NO SE REQUIERE PERO EL MÉTODO ESTÁ EN EL PRODUCTOSERVICE POR SI ACASO



}
