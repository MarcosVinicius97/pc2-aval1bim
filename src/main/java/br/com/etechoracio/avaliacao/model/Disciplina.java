package br.com.etechoracio.avaliacao.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Disciplina extends BaseORM {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;
	private Double aulasSemanais;
	private Date dataCriacao;

	@ManyToMany
	@JoinTable(name = "TBL_REL_DISCIPLINA_PROFESSOR", joinColumns = {
			@JoinColumn(name = "ID_DISCIPLINA") }, inverseJoinColumns = { @JoinColumn(name = "ID_PROFESSOR") })

	
	private List<Professor> professores;

	@PrePersist
	private void preencherDataCriacao() {
		if (dataCriacao == null) {
			dataCriacao = new Date();
		}
	}

	@Override
	public Long getId() {
		
		return null;
	}

	@Override
	public void setId(Long arg0) {
		
		
	}

}
