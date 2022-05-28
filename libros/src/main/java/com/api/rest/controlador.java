package com.api.rest;
import com.api.model.Libro;
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
@RequestMapping("/libros")
public class controlador {

    @Autowired
    private IContactoRepo repo;
    
    @GetMapping
    public  List<Libro> leerTodos()
    {
        return repo.findAll();
    }

    @PostMapping
    public void crear(@RequestBody Libro tempo) 
    {
        repo.save(tempo);
    }

    @PutMapping
    public boolean editar(@RequestBody Libro tempo)
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
    public  Optional<Libro> leerUno(@PathVariable int id)
    {
        return repo.findById(id);
    }
}
