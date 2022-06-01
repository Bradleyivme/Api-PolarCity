package com.example.demo.entities;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "campo vacío. Ingrese el número de factura")
    @Column(name="numeroFactura")
    //Length(min = 8, max=8, minMessage="factura inválida", maxMessage="factura inválida")
    private int numeroFacutra;

    @NotNull(message = "campo vacío. Ingrese la cantidad")
    @Column(name="total")
    private double total;


}
