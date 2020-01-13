package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.Persona;
@Repository
public class PersonaDaoImpl implements IPersonaDao {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Persona> findAll() {
		
		return em.createQuery ("from Personas").getResultList();
	}
	@Transactional
	@Override
	public void save(Persona persona) {
		if(persona.getPersonaId() !=null &&  persona.getPersonaId()>0) {
			em.merge(persona);
			
		}
		else {
			em.persist(persona);
		}

	}
	@Transactional
	@Override
	public Persona findOne(Long id) {
		// TODO Auto-generated method stub
		return em.find(Persona.class,id);
	}
	@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		em.remove(findOne(id));
	}

}
