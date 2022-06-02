package com.example.demo.Controllers;

import com.example.demo.entities.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
