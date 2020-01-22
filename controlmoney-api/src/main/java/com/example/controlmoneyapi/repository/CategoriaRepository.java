package com.example.controlmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controlmoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
