package com.example.demo.service;

import com.example.demo.DAO.UsuarioDAO;
import com.example.demo.entities.Usuario;
import com.example.demo.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    public Usuario buscarporId(long id) {
        Optional<Usuario> optionalUser = usuarioDAO.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }else {
            throw new NotFoundException("Usuario no encontrado");
        }
    }

    @Override
    public void crearUsuario(Usuario user) {
        usuarioDAO.save(user);

    }

    @Override
    public void modificarUsuario(long id, Usuario usuario) {
        if(usuarioDAO.existsById(id)){
            usuario.setId(id);
            usuarioDAO.save(usuario);
        }else {

            throw new NotFoundException("Usuario no encontrado");
        }

    }

    @Override
    public void borrarUsuario(long id) {
        if(usuarioDAO.existsById(id)) {
            usuarioDAO.deleteById(id);

        }else {

            throw new NotFoundException("Usuario no encontrado");
        }

    }
}
