package com.example.demo.DAO;

import com.example.demo.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
}
