package br.pucpr.bsi.prog6.ticketsAereosBSI.bc;

import java.util.List;

import br.pucpr.bsi.prog6.ticketsAereosBSI.model.Pessoa;


public class FuncionarioBC extends PessoaBC {

	private static FuncionarioBC instance;
	
	private FuncionarioBC(){
		
	}
	
	public static FuncionarioBC getInstance() {
	      if (instance == null)
	         instance = new FuncionarioBC();
	      return instance;
	   }

	@Override
	public Pessoa findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> findByFilter(Pessoa filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(Pessoa object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Pessoa object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pessoa object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void validateForDataModification(Pessoa object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void validateForFindData(Pessoa object) {
		// TODO Auto-generated method stub
		
	}
}