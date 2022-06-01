package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Debe ingresar el código del producto")
    @Column(name = "codigo")
    private String codigo;


    @NotBlank(message = "Debe ingresar el nombre del producto")
    @Column(name = "nombreProducto")
    private String nombreProducto;

    @NotBlank(message = "Debe ingresar la descripción")
    @Column(name = "descripcion")
    private String descripcion;

    @NotNull(message = "Debe ingresar el precio del producto")
    @NegativeOrZero(message = "El precio no puede ser igual a 0 o un número negativo")
    @Column(name = "precio")
    private double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
