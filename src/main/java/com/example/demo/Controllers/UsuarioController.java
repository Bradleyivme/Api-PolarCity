package com.example.demo.Controllers;

import com.example.demo.entities.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> ListarUsuario(){
        return usuarioService.listarUsuarios();
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        return usuarioService.buscarporId(id); }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearUsuario(@Valid @RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void modificarUsuario (@PathVariable Long id, @RequestBody Usuario usuario) {
        usuarioService.modificarUsuario(id, usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void BorrarUsuario(@PathVariable Long id) {
        usuarioService.borrarUsuario(id);
    }
}
