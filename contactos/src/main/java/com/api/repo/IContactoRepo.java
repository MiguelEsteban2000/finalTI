package com.api.repo;

import com.api.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepo extends JpaRepository<Contacto,Integer> {
    
}
