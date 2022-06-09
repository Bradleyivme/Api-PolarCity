package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;


@Entity
@Table(name="ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;

    @Column(name= "NombreCliente")
    private String NombreCliente;

    @Column(name="nit")
    private int Nit;

    @Column(name="total")
    @Min(value=1)
    private double Total;

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int nit) {
        Nit = nit;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
}