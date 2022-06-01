package com.example.demo.Controllers;

import com.example.demo.entities.Producto;
import com.example.demo.entities.Venta;
import com.example.demo.service.VentaService;
import com.example.demo.service.VentaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping
    public List<Venta> ListarVenta(){
        return ventaService.listarVentas();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearVenta(@Valid @RequestBody Venta venta) {
        ventaService.CrearVenta(venta);
    }

}
