package br.com.etechoracio.avaliacao.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.etechoracio.common.model.BaseORM;

public class Professor extends BaseORM{

	@Id
	@GeneratedValue
	private Long id;

	private Long matricula;
	private String nome;
	@Override
	public Long getId() {
		
		return null;
	}
	@Override
	public void setId(Long arg0) {
	
		
	}

}
