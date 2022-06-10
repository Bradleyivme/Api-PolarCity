package com.example.demo.Controllers;
import com.example.demo.entities.Orden;
import com.example.demo.service.OrdenService;
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
@RequestMapping("/ordenes")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping
    public List<Orden> ListarOrden(){
        return ordenService.listarOrdenes();
    }

    @GetMapping(value = "/{id}")
    public Orden findById(@PathVariable Long id) {
        return ordenService.buscarporId(id); }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void crearOrden(@Valid @RequestBody Orden orden) {
        ordenService.crearOrden(orden);
    }

    @PutMapping(value="/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void modificarOrden (@PathVariable Long id, @RequestBody Orden orden) {
        ordenService.modificarOrden(id, orden);
    }

    @DeleteMapping(value= "/{id}")
    public void BorrarOrden(@PathVariable Long id){
        ordenService.borrarOrden(id);
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
