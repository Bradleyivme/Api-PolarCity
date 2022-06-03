package com.example.demo.service;

import com.example.demo.DAO.OrdenDAO;
import com.example.demo.entities.Orden;
import com.example.demo.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements OrdenService{

    @Autowired
    OrdenDAO ordenDAO;
    @Override
    public List<Orden> listarOrdenes() {
        return ordenDAO.findAll();
    }

    @Override
    public Orden buscarporId(long idOrden) {
        Optional<Orden> OPorden = ordenDAO.findById(idOrden);

        if(OPorden.isPresent()) {
            return OPorden.get();

        }else {

            throw new NotFoundException("Orden no existe");
        }
    }

    @Override
    public void crearOrden(Orden orden) {
        ordenDAO.save(orden);

    }

    @Override
    public void modificarOrden(long idOrden, Orden orden) {
        if(ordenDAO.existsById(idOrden)){
            orden.setIdOrden(idOrden);
            ordenDAO.save(orden);
        }else {

            throw new NotFoundException("Orden no existe");
        }

    }

    @Override
    public void borrarOrden(long idOrden) {
        if(ordenDAO.existsById(idOrden)) {
            ordenDAO.deleteById(idOrden);

        }else {

            throw new NotFoundException("Orden no existe");
        }

    }

}