package com.example.controlmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controlmoneyapi.model.Lancamento;
import com.example.controlmoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}