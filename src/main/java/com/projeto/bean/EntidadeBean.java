package com.projeto.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projeto.model.Entidade;
import com.projeto.service.EntidadeService;

@Named
@ViewScoped
public class EntidadeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private @Inject Entidade entidade;
	
	private @Inject EntidadeService service;

	
	public void salvar() {
		try {
			service.salvar(entidade);
			entidade = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	public EntidadeService getService() {
		return service;
	}

	public void setService(EntidadeService service) {
		this.service = service;
	}
	
	

}
