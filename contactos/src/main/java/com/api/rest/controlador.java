package com.api.rest;
import com.api.controller.ControladorContactos;
import com.api.model.Contacto;
import com.api.repo.IContactoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/autores")
public class controlador {

    @Autowired
    private IContactoRepo repo;
    ControladorContactos controladorTempo= new ControladorContactos();
    
    @GetMapping
    public  List<Contacto> leerTodos()
    {
        return repo.findAll();
    }

    @PostMapping
    public void crear(@RequestBody Contacto tempo) 
    {
        repo.save(tempo);
        controladorTempo.crearContacto(tempo);
    }

    @PutMapping
    public boolean editar(@RequestBody Contacto tempo)
    {
        repo.save(tempo);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id)
    {
        repo.deleteById(id);
        return true;
    }

    @GetMapping("/{id}")
    public  Optional<Contacto> leerUno(@PathVariable int id)
    {
        return repo.findById(id);
    }
}
