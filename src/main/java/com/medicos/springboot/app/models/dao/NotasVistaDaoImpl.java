package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.NotasVista;

@Repository
public class NotasVistaDaoImpl implements INotasVistaDao {
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	

	@Override
	public List<NotasVista> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From NotasVista").getResultList();
	}

}
