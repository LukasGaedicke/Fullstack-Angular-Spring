package com.example.controlmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.controlmoneyapi.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
