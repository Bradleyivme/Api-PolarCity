package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Debe ingresar el nombre de usuario")
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @NotBlank(message = "Debe ingresar la contraseña")
    @Column(name = "contraseñaUsuario")
    private String contraseñaUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

}
