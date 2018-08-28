package com.projeto.serviceImpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.projeto.dao.EntidadeDAO;
import com.projeto.model.Entidade;
import com.projeto.service.EntidadeService;

public class EntidadeServiceImpl implements EntidadeService, Serializable{

	private static final long serialVersionUID = 1L;
	
	private @Inject EntidadeDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {
		dao.salvar(entidade);
	}

	@Override
	public List<Entidade> listarTodos() {
		return dao.listarTodos(Entidade.class);
	}

	@Override
	public void remover(Entidade entidade, Long id) throws Exception {
		dao.remover(Entidade.class, id);
	}

	@Override
	public Entidade buscarPorId(Entidade entidade, Long id) {
		return dao.buscarPorId(Entidade.class, id);
	}

	@Override
	public void editar(Entidade entidade) throws Exception {
		dao.editar(entidade);
	}

}
