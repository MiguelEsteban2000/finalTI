package com.api.repo;

import com.api.model.Libro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepo extends JpaRepository<Libro,Integer> {
    
}
