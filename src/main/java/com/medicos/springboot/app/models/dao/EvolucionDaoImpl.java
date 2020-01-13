package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.medicos.springboot.app.models.entity.Evolucion;

@Repository
public class EvolucionDaoImpl implements IEvolucionDao {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	

	@Override
	public List<Evolucion> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From Evolucion").getResultList();
	}//end_List

	@Override
	@Transactional(readOnly =true)
	public Evolucion findOne(Long EvolucionId) {
		// TODO Auto-generated method stub
		return em.find(Evolucion.class, EvolucionId);
	}//end_findOne

	
	@Override
	@Transactional
	public void save(Evolucion evolucion) {
		if(evolucion.getEvolucionId() != null && evolucion.getEvolucionId() >0) {
			em.merge(evolucion);
		}else {
			em.persist(evolucion);	
		}
		
	}//end_save

}//END_Class
