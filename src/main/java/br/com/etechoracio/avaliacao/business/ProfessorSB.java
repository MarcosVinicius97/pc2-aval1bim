package br.com.etechoracio.avaliacao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.common.business.BaseSB;



public class ProfessorSB extends BaseSB {

	@Autowired
	private ProfessorDAO professorDAO;

	public List<Professor> findAll();

	@Override
	protected void postConstructImpl() {
		professorDAO = getDAO(ProfessorDAO.class);
		
	}
}
