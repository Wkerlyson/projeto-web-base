package com.projeto.service;

import java.util.List;

import com.projeto.model.Entidade;

public interface EntidadeService {
	
	public void salvar(Entidade entidade) throws Exception;

	public List<Entidade> listarTodos();

	public void remover(Entidade entidade, Long id) throws Exception;

	public Entidade buscarPorId(Entidade entidade, Long id);

	public void editar(Entidade entidade) throws Exception;

}
