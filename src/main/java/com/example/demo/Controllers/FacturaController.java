package com.example.demo.Controllers;


import com.example.demo.entities.Factura;
import com.example.demo.entities.Orden;
import com.example.demo.entities.Producto;
import com.example.demo.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> ListarFacturas(){
        return facturaService.listarFacturas();
    }


    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearFactura(@Valid @RequestBody Factura factura) {

        facturaService.crearFactura(factura);
    }

}
