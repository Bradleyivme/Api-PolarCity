package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name ="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @NotBlank(message = "Debe ingresar el código del producto")
    @Column(name = "codigo")
    private String codigo;


    @NotBlank(message = "Debe ingresar el nombre del producto")
    @Column(name = "nombreProducto")
    private String nombreProducto;

    @NotBlank(message = "Debe ingresar la descripción")
    @Column(name = "descripcion")
    private String descripcion;

    @Min(value = 1)
    @Column(name = "precio")
    private double precio;

   
    public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
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
    
    //Hola solo cambiando

}
