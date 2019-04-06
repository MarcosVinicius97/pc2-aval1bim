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

}
