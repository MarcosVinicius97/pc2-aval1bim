package br.com.etechoracio.avaliacao.business;



import br.com.etechoracio.avaliacao.dao.DisciplinaDAO;
import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Disciplina;
import br.com.etechoracio.common.business.BaseSB;



public class DisciplinaSB extends BaseSB {

	private DisciplinaDAO disciplinaDAO;

	public void save(Disciplina disciplina) {
		disciplinaDAO.save(disciplina);
	}

	@Override
	protected void postConstructImpl() {
		
		disciplinaDAO = getDAO(DisciplinaDAO.class);
	}
}
