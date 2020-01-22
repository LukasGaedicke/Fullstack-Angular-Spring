package com.example.controlmoneyapi.repository.lancamento;

import java.util.List;

import com.example.controlmoneyapi.model.Lancamento;
import com.example.controlmoneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter filter);
	

}
