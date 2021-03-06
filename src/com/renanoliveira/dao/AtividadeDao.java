package com.renanoliveira.dao;

import java.util.List;

import com.renanoliveira.entity.Atividade;

/**
 *
 * @author renanaoliveira
 */
public class AtividadeDao extends GenericDAOImpl<Atividade> {
    
    public AtividadeDao(){
    
        super(Atividade.class);
    }
    
    public List<Atividade> listarTodos() {

        return getEntityManager().createQuery("SELECT a FROM Atividade a").getResultList();


    }
    
    public Atividade findByName(String nome){
    	return (Atividade) getEntityManager().createQuery("SELECT a FROM Atividade a WHERE nome = '"+nome+"'").getSingleResult();
    }

	@Override
	public List<Atividade> findAll() {
		return getEntityManager().createQuery("SELECT a FROM Atividade a").getResultList();
	}
    
}
