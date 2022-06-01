package com.example.demo.service;

import com.example.demo.entities.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listarUsuarios();
    public Usuario buscarporId(long id);

    public void crearUsuario(Usuario user);
    public void modificarUsuario(long id, Usuario usuario);
    public void borrarUsuario(long id);
}
