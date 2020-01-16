package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.medicos.springboot.app.models.entity.PacienteApp;


@Repository
public class PacienteAppDaoImpl implements IPacienteAppDao {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")


	@Override
	public List<PacienteApp> findAll() {
		return em.createQuery("From PacienteApp").getResultList();
	}

	@Override
	@Transactional(readOnly =true)
	public PacienteApp findOne(Long PacienteId) {
		
		// TODO Auto-generated method stub
		return em.find(PacienteApp.class,PacienteId);
	}
	
	@Override
	@Transactional																																																						
	public void save(PacienteApp pma) {
		if(pma.getPacienteId() != null && pma.getPacienteId() >0) {
			em.merge(pma);
		}else {
			em.persist(pma);	
		}
		
	}
	
	
	
}
