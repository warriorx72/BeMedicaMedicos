package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.PacienteMedicoAp;


@Repository
public class PacienteMedicoApDaoImpl implements IPacienteMedicoApDao {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")


	@Override
	public List<PacienteMedicoAp> findAll() {
		return em.createQuery("From PacienteMedicoAp").getResultList();
	}

	@Override
	@Transactional(readOnly =true)
	public PacienteMedicoAp findOne(Long AltaPacienteId) {
		
		// TODO Auto-generated method stub
		return em.find(PacienteMedicoAp.class,AltaPacienteId);
	}
	
	@Override
	@Transactional																																																						
	public void save(PacienteMedicoAp pma) {
		if(pma.getAltaPacienteId() != null && pma.getAltaPacienteId() >0) {
			em.merge(pma);
		}else {
			em.persist(pma);	
		}
		
	}
	
	
	
}
